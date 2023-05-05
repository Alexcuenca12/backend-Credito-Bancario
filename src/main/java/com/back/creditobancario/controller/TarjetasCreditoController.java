package com.back.creditobancario.controller;
//Controller para TarjetasCredito

//importaciones
import com.back.creditobancario.model.TarjetasCredito;
import com.back.creditobancario.service.Servicios.TarjetasCreditoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/tarjetasCredito")
public class TarjetasCreditoController {
    @Autowired
    TarjetasCreditoService tarjetasCreditoService;

    @GetMapping("/listar")
    public ResponseEntity<List<TarjetasCredito>> obtenerLista() {
        try {
            return new ResponseEntity<>(tarjetasCreditoService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<TarjetasCredito> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(tarjetasCreditoService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<TarjetasCredito> crear(@RequestBody TarjetasCredito p) {
        try {
            return new ResponseEntity<>(tarjetasCreditoService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody TarjetasCredito p) {
        TarjetasCredito TarjetasCredito = tarjetasCreditoService.findById(id);
        if (TarjetasCredito == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                TarjetasCredito.setTarCred_estado(false);
                return new ResponseEntity<>(tarjetasCreditoService.save(TarjetasCredito), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
