package com.back.creditobancario.controller;

import com.back.creditobancario.model.Provincia;
import com.back.creditobancario.service.Servicios.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/provincia")
public class ProvinciaController {

    @Autowired
    ProvinciaService provinciaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Provincia>> obtenerLista() {
        try {
            return new ResponseEntity<>(provinciaService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/buscar/{id}")
    public ResponseEntity<Provincia> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(provinciaService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/crear")
    public ResponseEntity<Provincia> crear(@RequestBody Provincia p) {
        try {
            return new ResponseEntity<>(provinciaService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Provincia p) {
        Provincia provincia = provinciaService.findById(id);
        if (provincia == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                provincia.setProvincia_estado(false);
                return new ResponseEntity<>(provinciaService.save(provincia), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Provincia> actualizarProvincia(@PathVariable Long id, @RequestBody Provincia p) {
        Provincia provincia = provinciaService.findById(id);
        if (provincia == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                provincia.setProvincia_codigo(p.getProvincia_codigo());
                provincia.setProvincia_nombre(p.getProvincia_nombre());
                return new ResponseEntity<>(provinciaService.save(provincia), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
