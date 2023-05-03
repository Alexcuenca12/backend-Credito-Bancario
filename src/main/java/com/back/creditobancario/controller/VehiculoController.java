package com.back.creditobancario.controller;
//Cotroller para Vehiculo

//importaciones
import com.back.creditobancario.model.Vehiculo;
import com.back.creditobancario.service.Servicios.VehiculoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/vehiculo")
public class VehiculoController {
    @Autowired
    VehiculoService vehiculoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Vehiculo>> obtenerLista() {
        try {
            return new ResponseEntity<>(vehiculoService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Vehiculo> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(vehiculoService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Vehiculo> crear(@RequestBody Vehiculo p) {
        try {
            return new ResponseEntity<>(vehiculoService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Vehiculo p) {
        Vehiculo Vehiculo = vehiculoService.findById(id);
        if (Vehiculo == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                Vehiculo.setVehiculo_estado(false);
                return new ResponseEntity<>(vehiculoService.save(Vehiculo), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
