package com.back.creditobancario.controller;

import com.back.creditobancario.model.Negocio;
import com.back.creditobancario.service.Servicios.NegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/negocio")
public class NegocioController {

    @Autowired
    NegocioService negocioService;

    @GetMapping("/listar")
    public ResponseEntity<List<Negocio>> obtenerLista() {
        try {
            return new ResponseEntity<>(negocioService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Negocio> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(negocioService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Negocio> crear(@RequestBody Negocio p) {
        try {
            return new ResponseEntity<>(negocioService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Negocio p) {
        Negocio negocio = negocioService.findById(id);
        if (negocio == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                negocio.setNego_estado(false);
                return new ResponseEntity<>(negocioService.save(negocio), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Negocio> actualizarNegocio(@PathVariable Long id, @RequestBody Negocio p) {
        Negocio negocio = negocioService.findById(id);
        if (negocio == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                negocio.setNego_actividad(p.getNego_actividad());
                negocio.setNego_tiempo(p.getNego_tiempo());
                negocio.setNego_tipo(p.getNego_tipo());
                negocio.setNego_nombre(p.getNego_nombre());
                return new ResponseEntity<>(negocioService.save(negocio), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

}
