package com.back.creditobancario.controller;
//Controlador para Ingresos

//importaciones
import com.back.creditobancario.model.Ingresos;
import com.back.creditobancario.service.Servicios.IngresosService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/ingresos")
public class IngresosController {
    @Autowired
    IngresosService ingresosService;

    @GetMapping("/listar")
    public ResponseEntity<List<Ingresos>> obtenerLista() {
        try {
            return new ResponseEntity<>(ingresosService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Ingresos> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(ingresosService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Ingresos> crear(@RequestBody Ingresos p) {
        try {
            return new ResponseEntity<>(ingresosService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Ingresos p) {
        Ingresos Ingresos = ingresosService.findById(id);
        if (Ingresos == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                Ingresos.setIngr_estado(false);
                return new ResponseEntity<>(ingresosService.save(Ingresos), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    //Metodo para actualizar
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody Ingresos p) {
        Ingresos ingresos = ingresosService.findById(id);
        if (ingresos == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                ingresos.setIngr_totalIngresos(p.getIngr_totalIngresos());
                ingresos.setIngr_remesas(p.getIngr_remesas());
                ingresos.setIngr_sueldoConyugue(p.getIngr_sueldoConyugue());
                ingresos.setIngr_sueldoMensual(p.getIngr_sueldoMensual());
                ingresos.setIngr_pensionJubilados(p.getIngr_pensionJubilados());
                ingresos.setIngr_otrosIngresos(p.getIngr_otrosIngresos());
                ingresos.setIngr_ingresosServicios(p.getIngr_ingresosServicios());
                ingresos.setIngr_estado(p.getIngr_estado());
                return new ResponseEntity<>(ingresosService.save(ingresos), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}