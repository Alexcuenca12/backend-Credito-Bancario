package com.back.creditobancario.controller;

import com.back.creditobancario.model.ControlCredito;
import com.back.creditobancario.model.EmailDTO;
import com.back.creditobancario.model.EmailFileDTO;
import com.back.creditobancario.service.Servicios.ControlCreditoService;
import com.back.creditobancario.service.Servicios.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.util.Base64Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @Autowired
    ControlCreditoService controlCreditoService;

    @PostMapping("/sendEmail")
    public ResponseEntity<?> requestEmail(@RequestBody EmailDTO emailDTO){

        System.out.println("Mensaje Recibido " + emailDTO);

        emailService.sendEmail(emailDTO.getToUser(), emailDTO.getSubject(), emailDTO.getMessage());

        Map<String, String> response = new HashMap<>();
        response.put("estado", "Enviado");

        return ResponseEntity.ok(response);
    }


    @PostMapping("/sendEmailFile/{id}")
    public ResponseEntity<?> requestEmailFile(@PathVariable Long id, @ModelAttribute EmailFileDTO emailFileDTO){
        String emailRechazo;
        ControlCredito controlCredito = controlCreditoService.findByIDSoli(id);
        if (controlCredito == null){return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
        else{emailRechazo = controlCredito.getCorreoRechazo();}

        String base64file = emailRechazo;
        byte[] fileBytes = Base64Utils.decodeFromString(base64file);
        File outputFile = new File("src/main/resources/files/Solicitud_Credito_Rechazado.pdf");
        try (FileOutputStream outputStream = new FileOutputStream(outputFile)) {
            outputStream.write(fileBytes);
        } catch (FileNotFoundException e) {throw new RuntimeException(e);
        } catch (IOException e) {throw new RuntimeException(e);}

        try {
            Path path = Paths.get("src/main/resources/files/Solicitud_Credito_Rechazado.pdf");
            File file = path.toFile();
            emailService.sendEmailWithFile(emailFileDTO.getToUser(), emailFileDTO.getSubject(), emailFileDTO.getMessage(), file);
            Map<String, String> response = new HashMap<>();
            response.put("estado", "Enviado");
            response.put("archivo", "Solicitud_Credito_Rechazado.pdf");

            return ResponseEntity.ok(response);

        } catch (Exception e){
            throw new RuntimeException("Error al enviar el Email con el archivo. " + e.getMessage());
        }
    }
}
