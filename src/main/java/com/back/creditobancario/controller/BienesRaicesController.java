package com.back.creditobancario.controller;
//Controlador para BienesRaices

//importaciones
import com.back.creditobancario.model.BienesRaices;
import com.back.creditobancario.service.Servicios.BienesRaicesService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/bienesRaices")
public class BienesRaicesController {
    @Autowired
    BienesRaicesService bienesRaicesService;

    @GetMapping("/listar")
    public ResponseEntity<List<BienesRaices>> obtenerLista() {
        try {
            return new ResponseEntity<>(bienesRaicesService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<BienesRaices> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(bienesRaicesService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<BienesRaices> crear(@RequestBody BienesRaices p) {
        try {
            return new ResponseEntity<>(bienesRaicesService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody BienesRaices p) {
        BienesRaices BienesRaices = bienesRaicesService.findById(id);
        if (BienesRaices == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                BienesRaices.setBienRaic_estado(false);
                return new ResponseEntity<>(bienesRaicesService.save(BienesRaices), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
