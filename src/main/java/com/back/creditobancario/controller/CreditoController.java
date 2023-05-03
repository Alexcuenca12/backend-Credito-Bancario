package com.back.creditobancario.controller;
//Controlador para Credito

//importaciones
import com.back.creditobancario.model.Credito;
import com.back.creditobancario.service.Servicios.CreditoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/credito")
public class CreditoController {
    @Autowired
    CreditoService creditoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Credito>> obtenerLista() {
        try {
            return new ResponseEntity<>(creditoService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Credito> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(creditoService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Credito> crear(@RequestBody Credito p) {
        try {
            return new ResponseEntity<>(creditoService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Credito p) {
        Credito Credito = creditoService.findById(id);
        if (Credito == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                Credito.setCredito_estado(false);
                return new ResponseEntity<>(creditoService.save(Credito), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
