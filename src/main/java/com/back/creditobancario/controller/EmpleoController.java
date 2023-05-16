package com.back.creditobancario.controller;

import com.back.creditobancario.model.Empleo;
import com.back.creditobancario.service.Servicios.EmpleoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/empleo")
public class EmpleoController {

    @Autowired
    EmpleoService empleoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Empleo>> obtenerLista() {
        try {
            return new ResponseEntity<>(empleoService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Empleo> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(empleoService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Empleo> crear(@RequestBody Empleo p) {
        try {
            return new ResponseEntity<>(empleoService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Empleo p) {
        Empleo empleo = empleoService.findById(id);
        if (empleo == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                empleo.setEmpl_estado(false);
                return new ResponseEntity<>(empleoService.save(empleo), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    //Metodo para actualizar
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Empleo> actualizarEmpleo(@PathVariable Long id, @RequestBody Empleo p) {
        Empleo empleo = empleoService.findById(id);
        if (empleo == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                empleo.setEmpl_tipoEmpleado(p.getEmpl_tipoEmpleado());
                empleo.setEmpl_actividadEmpresa(p.getEmpl_actividadEmpresa());
                empleo.setEmpl_nombreEmpresa(p.getEmpl_nombreEmpresa());
                empleo.setEmpl_cargoEmpresa(p.getEmpl_cargoEmpresa());
                empleo.setEmpl_telefonoEmpresa(p.getEmpl_telefonoEmpresa());
                empleo.setEmpl_referenciaEmpresa(p.getEmpl_referenciaEmpresa());
                empleo.setEmpl_tiempoEmpresa(p.getEmpl_tiempoEmpresa());

                return new ResponseEntity<>(empleoService.save(empleo), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
