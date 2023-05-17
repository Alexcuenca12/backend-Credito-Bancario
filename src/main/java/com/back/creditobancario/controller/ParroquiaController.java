package com.back.creditobancario.controller;

import com.back.creditobancario.model.Canton;
import com.back.creditobancario.model.Parroquia;
import com.back.creditobancario.repository.ParroquiaRepository;
import com.back.creditobancario.service.Servicios.ParroquiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/parroquia")
public class ParroquiaController {
    @Autowired
    ParroquiaService parroquiaService;

    @Autowired
    ParroquiaRepository  parroquiaRepository;

    @GetMapping("/listar")
    public ResponseEntity<List<Parroquia>> obtenerLista() {
        try {
            return new ResponseEntity<>(parroquiaService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/buscar/{id}")
    public ResponseEntity<Parroquia> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(parroquiaService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/parishByCantons/{id}")
    public List<Parroquia> getParroquiasByCantonId(@PathVariable Long id) {
        Canton canton = new Canton();
        canton.setCant_id(id);
        return parroquiaRepository.findByCanton(canton);
    }

    @PostMapping("/crear")
    public ResponseEntity<Parroquia> crear(@RequestBody Parroquia p) {
        try {
            return new ResponseEntity<>(parroquiaService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Parroquia p) {
        Parroquia parroquia = parroquiaService.findById(id);
        if (parroquia == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
//                parroquia.setParr_estado(false);
                return new ResponseEntity<>(parroquiaService.save(parroquia), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Parroquia> actualizarParroquia(@PathVariable Long id, @RequestBody Parroquia p) {
        Parroquia parroquia = parroquiaService.findById(id);
        if (parroquia == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                parroquia.setParr_codigo(p.getParr_codigo());
                parroquia.setParr_nombre(p.getParr_nombre());
                return new ResponseEntity<>(parroquiaService.save(parroquia), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
