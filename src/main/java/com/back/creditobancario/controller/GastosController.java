package com.back.creditobancario.controller;
//Controlador de Gastos

//importaciones
import com.back.creditobancario.model.Gastos;
import com.back.creditobancario.service.Servicios.GastosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/gastos")
public class GastosController {
    @Autowired
    GastosService gastosService;

    @GetMapping("/listar")
    public ResponseEntity<List<Gastos>> obtenerLista() {
        try {
            return new ResponseEntity<>(gastosService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Gastos> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(gastosService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Gastos> crear(@RequestBody Gastos p) {
        try {
            return new ResponseEntity<>(gastosService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Gastos p) {
        Gastos Gastos = gastosService.findById(id);
        if (Gastos == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                Gastos.setGast_estado(false);
                return new ResponseEntity<>(gastosService.save(Gastos), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody Gastos p) {
        Gastos Gastos = gastosService.findById(id);
        if (Gastos == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                //Pendiente
                return new ResponseEntity<>(gastosService.save(Gastos), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
