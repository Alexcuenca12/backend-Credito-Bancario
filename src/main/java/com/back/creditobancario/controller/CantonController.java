package com.back.creditobancario.controller;

import com.back.creditobancario.model.Canton;
import com.back.creditobancario.service.Servicios.CantonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/canton")
public class CantonController {
    @Autowired
    CantonService cantonService;

    @GetMapping("/listar")
    public ResponseEntity<List<Canton>> obtenerLista() {
        try {
            return new ResponseEntity<>(cantonService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/buscar/{id}")
    public ResponseEntity<Canton> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(cantonService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/crear")
    public ResponseEntity<Canton> crear(@RequestBody Canton p) {
        try {
            return new ResponseEntity<>(cantonService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Canton p) {
        Canton Canton = cantonService.findById(id);
        if (Canton == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                Canton.setCanton_estado(false);
                return new ResponseEntity<>(cantonService.save(Canton), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Canton> actualizarCanton(@PathVariable Long id, @RequestBody Canton p) {
        Canton canton = cantonService.findById(id);
        if (canton == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                canton.setCanton_codigo(p.getCanton_codigo());
                canton.setCanton_nombre(p.getCanton_nombre());

                return new ResponseEntity<>(cantonService.save(canton), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
