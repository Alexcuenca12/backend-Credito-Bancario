package com.back.creditobancario.controller;
//Controlador para AnexoCredito

//importaciones
import com.back.creditobancario.model.AnexoCredito;
import com.back.creditobancario.service.Servicios.AnexoCreditoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/anexoCredito")
public class AnexoCreditoController {
    @Autowired
    AnexoCreditoService anexoCreditoService;

    @GetMapping("/listar")
    public ResponseEntity<List<AnexoCredito>> obtenerLista() {
        try {
            return new ResponseEntity<>(anexoCreditoService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<AnexoCredito> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(anexoCreditoService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<AnexoCredito> crear(@RequestBody AnexoCredito p) {
        try {
            return new ResponseEntity<>(anexoCreditoService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody AnexoCredito p) {
        AnexoCredito AnexoCredito = anexoCreditoService.findById(id);
        if (AnexoCredito == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                AnexoCredito.setAneCred_estado(false);
                return new ResponseEntity<>(anexoCreditoService.save(AnexoCredito), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
