package com.back.creditobancario.controller;
//Controller para TablaBuro

//importaciones
import com.back.creditobancario.model.TablaBuro;
import com.back.creditobancario.service.Servicios.TablaBuroService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/tablaBuro")
public class TablaBuroController {
    @Autowired
    TablaBuroService tablaBuroService;

    @GetMapping("/listar")
    public ResponseEntity<List<TablaBuro>> obtenerLista() {
        try {
            return new ResponseEntity<>(tablaBuroService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<TablaBuro> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(tablaBuroService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<TablaBuro> crear(@RequestBody TablaBuro p) {
        try {
            return new ResponseEntity<>(tablaBuroService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody TablaBuro p) {
        TablaBuro TablaBuro = tablaBuroService.findById(id);
        if (TablaBuro == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                TablaBuro.setTabBuro_estado(false);
                return new ResponseEntity<>(tablaBuroService.save(TablaBuro), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
