package com.back.creditobancario.controller;
//Controlador para Credito

//importaciones
import com.back.creditobancario.model.Credito;
import com.back.creditobancario.service.Servicios.CreditoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/credito")
public class CreditoController {
    @Autowired
    CreditoService creditoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Credito>> obtenerLista() {
        try {
            return new ResponseEntity<>(creditoService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Credito> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(creditoService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Credito> crear(@RequestBody Credito p) {
        try {
            return new ResponseEntity<>(creditoService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Credito p) {
        Credito Credito = creditoService.findById(id);
        if (Credito == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                Credito.setCred_estado(false);
                return new ResponseEntity<>(creditoService.save(Credito), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    //Metodo para actualizar el estado de un credito
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody Credito p) {
        Credito credito = creditoService.findById(id);
        if (credito == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                credito.setCred_fecha(p.getCred_fecha());
                credito.setCred_monto(p.getCred_monto());
                credito.setCred_plazo(p.getCred_plazo());
                credito.setCred_numero(p.getCred_numero());
                credito.setSucursal(p.getSucursal());
                credito.setDestino_credito(p.getDestino_credito());
                credito.setAnexo_credito(p.getAnexo_credito());
                credito.setCred_estado(p.getCred_estado());
                return new ResponseEntity<>(creditoService.save(credito), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
