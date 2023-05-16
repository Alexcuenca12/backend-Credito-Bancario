package com.back.creditobancario.controller;
//Controlador para Buro

//importaciones
import com.back.creditobancario.model.Buro;
import com.back.creditobancario.service.Servicios.BuroService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/buro")
public class BuroController {
    @Autowired
    BuroService buroService;

    @GetMapping("/listar")
    public ResponseEntity<List<Buro>> obtenerLista() {
        try {
            return new ResponseEntity<>(buroService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Buro> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(buroService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Buro> crear(@RequestBody Buro p) {
        try {
            return new ResponseEntity<>(buroService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Buro p) {
        Buro Buro = buroService.findById(id);
        if (Buro == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                Buro.setBuro_estado(false);
                return new ResponseEntity<>(buroService.save(Buro), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody Buro p) {
        Buro Buro = buroService.findById(id);
        if (Buro == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                p.setBuro_id(id);
                p.setBuro_estado(p.getBuro_estado());
                p.setBuro_deudasVencidas(p.getBuro_deudasVencidas());
                p.setTablaBuro(p.getTablaBuro());
                p.setSolicitud(p.getSolicitud());
                return new ResponseEntity<>(buroService.save(p), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

}
