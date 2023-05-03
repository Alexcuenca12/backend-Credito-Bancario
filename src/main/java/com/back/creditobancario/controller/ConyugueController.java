package com.back.creditobancario.controller;


import com.back.creditobancario.model.Conyugue;
import com.back.creditobancario.service.Servicios.ConyugueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/conyugue")
public class ConyugueController {
    @Autowired
    ConyugueService conyugueService;


    @GetMapping("/listar")
    public ResponseEntity<List<Conyugue>> obtenerLista() {
        try {
            return new ResponseEntity<>(conyugueService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/buscar/{id}")
    public ResponseEntity<Conyugue> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(conyugueService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/crear")
    public ResponseEntity<Conyugue> crear(@RequestBody Conyugue c) {
        try {
            return new ResponseEntity<>(conyugueService.save(c), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Conyugue p) {
        Conyugue conyugue = conyugueService.findById(id);
        if (conyugue == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                conyugue.setCony_estado(false);
                return new ResponseEntity<>(conyugueService.save(conyugue), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Conyugue> actualizarConyugue(@PathVariable Long id, @RequestBody Conyugue p) {
        Conyugue conyugue = conyugueService.findById(id);
        if (conyugue == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {

                return new ResponseEntity<>(conyugueService.save(conyugue), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
