package com.back.creditobancario.controller;
//Controlador para DestinoCredito

//importaciones
import com.back.creditobancario.model.DestinoCredito;
import com.back.creditobancario.service.Servicios.DestinoCreditoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/destinoCredito")
public class DestinoCreditoController {
    @Autowired
    DestinoCreditoService destinoCreditoService;

    @GetMapping("/listar")
    public ResponseEntity<List<DestinoCredito>> obtenerLista() {
        try {
            return new ResponseEntity<>(destinoCreditoService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<DestinoCredito> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(destinoCreditoService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<DestinoCredito> crear(@RequestBody DestinoCredito p) {
        try {
            return new ResponseEntity<>(destinoCreditoService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody DestinoCredito p) {
        DestinoCredito DestinoCredito = destinoCreditoService.findById(id);
        if (DestinoCredito == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                DestinoCredito.setDesCred_estado(false);
                return new ResponseEntity<>(destinoCreditoService.save(DestinoCredito), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    //Metodo para actualizar
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody DestinoCredito p) {
        DestinoCredito destinoCredito = destinoCreditoService.findById(id);
        if (destinoCredito == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                destinoCredito.setDesCred_categoria(p.getDesCred_categoria());
                destinoCredito.setDesCred_descripcion(p.getDesCred_descripcion());
                destinoCredito.setDesCred_estado(p.getDesCred_estado());
                return new ResponseEntity<>(destinoCreditoService.save(destinoCredito), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
