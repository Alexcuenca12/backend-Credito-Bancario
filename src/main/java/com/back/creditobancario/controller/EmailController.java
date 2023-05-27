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
@CrossOrigin(origins = {"*"})
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


    @PostMapping("/sendMailFile")
    public ResponseEntity<?> requestMailFile(@ModelAttribute EmailFileDTO emailFileDTO){
        try {
            String fileName = emailFileDTO.getFile().getOriginalFilename();
            Path path = Paths.get("src/main/resources/files/" + fileName);

            Files.createDirectories(path.getParent());
            Files.copy(emailFileDTO.getFile().getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);

            File file = path.toFile();
            emailService.sendEmailWithFile(emailFileDTO.getToUser(), emailFileDTO.getSubject(), emailFileDTO.getMessage(), file);

            Map<String, String> response = new HashMap<>();
            response.put("estado", "Enviado");
            response.put("archivo", fileName);

            return ResponseEntity.ok(response);

        } catch (Exception e){
            throw new RuntimeException("Error al enviar el Email con el archivo. " + e.getMessage());
        }
    }

    @PostMapping("/sendMailFile")
    public ResponseEntity<?> requestMailFile(@ModelAttribute EmailFileDTO emailFileDTO){
        try {
            String fileName = emailFileDTO.getFile().getOriginalFilename();
            Path path = Paths.get("src/main/resources/files/" + fileName);

            Files.createDirectories(path.getParent());
            Files.copy(emailFileDTO.getFile().getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);

            File file = path.toFile();

            emailService.sendEmailWithFile(emailFileDTO.getToUser(), emailFileDTO.getSubject(), emailFileDTO.getMessage(), file);

            Map<String, String> response = new HashMap<>();
            response.put("estado", "Enviado");
            response.put("archivo", fileName);

            return ResponseEntity.ok(response);

        } catch (Exception e){
            throw new RuntimeException("Error al enviar el Email con el archivo. " + e.getMessage());
        }
    }

}
