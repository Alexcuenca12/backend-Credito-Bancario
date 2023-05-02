package com.back.creditobancario.controller;
//Controlador de Buro

//importaciones
import com.back.creditobancario.model.Deudas;
import com.back.creditobancario.service.Servicios.DeudasService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/deudas")
public class DeudasController {
    @Autowired
    DeudasService deudasService;

    @GetMapping("/listar")
    public ResponseEntity<List<Deudas>> obtenerLista() {
        try {
            return new ResponseEntity<>(deudasService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Deudas> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(deudasService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Deudas> crear(@RequestBody Deudas p) {
        try {
            return new ResponseEntity<>(deudasService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Deudas p) {
        Deudas Deudas = deudasService.findById(id);
        if (Deudas == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                Deudas.setDeudas_estado(false);
                return new ResponseEntity<>(deudasService.save(Deudas), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
