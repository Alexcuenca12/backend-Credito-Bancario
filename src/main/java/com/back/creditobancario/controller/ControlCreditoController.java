package com.back.creditobancario.controller;

import com.back.creditobancario.model.Buro;
import com.back.creditobancario.model.ControlCredito;
import com.back.creditobancario.service.Servicios.ControlCreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/controlcredito")
public class ControlCreditoController {
    @Autowired
    ControlCreditoService controlCreditoService;


    @GetMapping("/listar")
    public ResponseEntity<List<ControlCredito>> obtenerLista() {
        try {
            return new ResponseEntity<>(controlCreditoService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<ControlCredito> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(controlCreditoService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<ControlCredito> crear(@RequestBody ControlCredito p) {
        try {
            return new ResponseEntity<>(controlCreditoService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody ControlCredito p) {
        ControlCredito controlCredito = controlCreditoService.findById(id);
        if (controlCredito == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                controlCredito.setControlEstado(false);
                return new ResponseEntity<>(controlCreditoService.save(controlCredito), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody ControlCredito p) {
        ControlCredito controlCredito = controlCreditoService.findById(id);
        if (controlCredito == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                p.setResumenEstado(p.getResumenEstado());
                p.setSolicitudCredito(p.getSolicitudCredito());
                p.setCuadroCumplimiento(p.getCuadroCumplimiento());
                p.setListaVerificacion(p.getListaVerificacion());
                p.setResumenEstado(p.getResumenEstado());
                p.setSolicitud(p.getSolicitud());
                return new ResponseEntity<>(controlCreditoService.save(p), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizarListaVerificacion/{id}")
    public ResponseEntity<?> actualizarListaVerificacion(@PathVariable Long id, @RequestParam("file") MultipartFile file) {
        ControlCredito controlCredito = controlCreditoService.findByIDSoli(id);
        if (controlCredito == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                // Obtener el contenido del archivo
                byte[] fileContent = file.getBytes();

                // Convertir el contenido a base64
                String base64PDF = Base64.getEncoder().encodeToString(fileContent);

                // Actualizar la entidad con el contenido en base64
                controlCredito.setListaVerificacion(base64PDF);

                // Guardar la entidad actualizada
                controlCreditoService.save(controlCredito);

                return new ResponseEntity<>(controlCredito, HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }


}
