package com.back.creditobancario.controller;

import com.back.creditobancario.model.Domicilio;
import com.back.creditobancario.service.Servicios.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/domicilio")
public class DomicilioController {
    @Autowired
    DomicilioService domicilioService;

    @GetMapping("/listar")
    public ResponseEntity<List<Domicilio>> obtenerLista() {
        try {
            return new ResponseEntity<>(domicilioService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Domicilio> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(domicilioService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Domicilio> crear(@RequestBody Domicilio p) {
        try {
            return new ResponseEntity<>(domicilioService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Domicilio p) {
        Domicilio domicilio = domicilioService.findById(id);
        if (domicilio == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                domicilio.setDomicilio_estado(false);
                return new ResponseEntity<>(domicilioService.save(domicilio), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Domicilio> actualizarDomicilio(@PathVariable Long id, @RequestBody Domicilio p) {
        Domicilio domicilio = domicilioService.findById(id);
        if (domicilio == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                domicilio.setDomicilio_color(p.getDomicilio_color());
                domicilio.setDomicilio_tenencia(p.getDomicilio_color());
                domicilio.setDomicilio_hipoteca(p.getDomicilio_hipoteca());
                domicilio.setDomicilio_aniosresidencia(p.getDomicilio_aniosresidencia());
                domicilio.setDomicilio_referencia(p.getDomicilio_referencia());
                domicilio.setDomicilio_propietario(p.getDomicilio_propietario());
                domicilio.setDomicilio_tlfnPropietario(p.getDomicilio_tlfnPropietario());
                return new ResponseEntity<>(domicilioService.save(domicilio), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
