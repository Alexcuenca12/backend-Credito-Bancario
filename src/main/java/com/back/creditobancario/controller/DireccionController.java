package com.back.creditobancario.controller;

import com.back.creditobancario.model.Direccion;
import com.back.creditobancario.service.Servicios.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/direccion")
public class DireccionController {
    @Autowired
    DireccionService direccionService;

    @GetMapping("/listar")
    public ResponseEntity<List<Direccion>> obtenerLista() {
        try {
            return new ResponseEntity<>(direccionService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Direccion> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(direccionService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Direccion> crear(@RequestBody Direccion p) {
        try {
            return new ResponseEntity<>(direccionService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Direccion p) {
        Direccion direccion = direccionService.findById(id);
        if (direccion == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                direccion.setDire_Estado(false);
                return new ResponseEntity<>(direccionService.save(direccion), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Direccion> actualizarDireccion(@PathVariable Long id, @RequestBody Direccion p) {
        Direccion direccion = direccionService.findById(id);
        if (direccion == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                direccion.setDire_Calle(p.getDire_Calle());
                direccion.setDire_Interseccion(p.getDire_Interseccion());
                direccion.setDire_Numero(p.getDire_Numero());
                direccion.setDire_Sector(p.getDire_Sector());
                return new ResponseEntity<>(direccionService.save(direccion), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
