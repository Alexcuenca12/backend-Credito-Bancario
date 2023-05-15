package com.back.creditobancario.controller;
//Controlador para ReferenciasBancarias

//importaciones
import com.back.creditobancario.model.ReferenciasBancarias;
import com.back.creditobancario.service.Servicios.ReferenciasBancariasService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/referenciasBancarias")
public class ReferenciasBancariasController {
    @Autowired
    ReferenciasBancariasService referenciasBancariasService;

    @GetMapping("/listar")
    public ResponseEntity<List<ReferenciasBancarias>> obtenerLista() {
        try {
            return new ResponseEntity<>(referenciasBancariasService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<ReferenciasBancarias> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(referenciasBancariasService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<ReferenciasBancarias> crear(@RequestBody ReferenciasBancarias p) {
        try {
            return new ResponseEntity<>(referenciasBancariasService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody ReferenciasBancarias p) {
        ReferenciasBancarias ReferenciasBancarias = referenciasBancariasService.findById(id);
        if (ReferenciasBancarias == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                ReferenciasBancarias.setRefBanc_estado(false);
                return new ResponseEntity<>(referenciasBancariasService.save(ReferenciasBancarias), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody ReferenciasBancarias p) {
        ReferenciasBancarias referenciasBancarias = referenciasBancariasService.findById(id);
        if (referenciasBancarias == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                referenciasBancarias.setRefBanc_nombre(p.getRefBanc_nombre());
                referenciasBancarias.setRefBanc_numero(p.getRefBanc_numero());
                referenciasBancarias.setRefBanc_tipo(p.getRefBanc_tipo());
                referenciasBancarias.setRefBanc_apertura(p.getRefBanc_apertura());
                referenciasBancarias.setRefBanc_cifrasPromedio(p.getRefBanc_cifrasPromedio());
                referenciasBancarias.setRefBanc_saldo(p.getRefBanc_saldo());
                referenciasBancarias.setRefBanc_estado(p.getRefBanc_estado());
                return new ResponseEntity<>(referenciasBancariasService.save(referenciasBancarias), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
