package com.back.creditobancario.controller;
//Controlador para Solicitante

//importaciones
import com.back.creditobancario.model.Solicitante;
import com.back.creditobancario.service.Servicios.SolicitanteService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/solicitante")
public class SolicitanteController {
    @Autowired
    SolicitanteService solicitanteService;

    @GetMapping("/listar")
    public ResponseEntity<List<Solicitante>> obtenerLista() {
        try {
            return new ResponseEntity<>(solicitanteService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Solicitante> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(solicitanteService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Solicitante> crear(@RequestBody Solicitante p) {
        try {
            return new ResponseEntity<>(solicitanteService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Solicitante p) {
        Solicitante Solicitante = solicitanteService.findById(id);
        if (Solicitante == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                Solicitante.setSoli_estado(false);
                return new ResponseEntity<>(solicitanteService.save(Solicitante), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
