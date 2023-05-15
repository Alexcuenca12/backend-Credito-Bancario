package com.back.creditobancario.controller;

import com.back.creditobancario.model.Sucursal;
import com.back.creditobancario.service.Servicios.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/sucursal")
public class SucursalController {

    @Autowired
    SucursalService sucursalService;

    @GetMapping("/listar")
    public ResponseEntity<List<Sucursal>> obtenerLista() {
        try {
            return new ResponseEntity<>(sucursalService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/buscar-id/{id}")
    public ResponseEntity<Sucursal> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(sucursalService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar-nombre/{id}")
    public ResponseEntity<Sucursal> getById(@PathVariable("nombre") String nombre) {
        try {
            return new ResponseEntity<>(sucursalService.findByNombre(nombre), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Sucursal> crear(@RequestBody Sucursal p) {
        try {
            return new ResponseEntity<>(sucursalService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Sucursal p) {
        Sucursal sucursal = sucursalService.findById(id);
        if (sucursal == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                sucursal.setSucu_estado(false);
                return new ResponseEntity<>(sucursalService.save(sucursal), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Sucursal> actualizarSucursal(@PathVariable Long id, @RequestBody Sucursal p) {
        Sucursal sucursal = sucursalService.findById(id);
        if (sucursal == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                sucursal.setUsuario(p.getUsuario());
                sucursal.setDireccion(p.getDireccion());
                sucursal.setSucu_nombre(p.getSucu_nombre());
                sucursal.setSucu_estado(true);
                return new ResponseEntity<>(sucursalService.save(sucursal), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
