package com.back.creditobancario.controller;
//Controlador de Buro

//importaciones
import com.back.creditobancario.model.Deudas;
import com.back.creditobancario.service.Servicios.DeudasService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/deudas")
public class DeudasController {
    @Autowired
    DeudasService deudasService;

    @GetMapping("/listar")
    public ResponseEntity<List<Deudas>> obtenerLista() {
        try {
            return new ResponseEntity<>(deudasService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Deudas> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(deudasService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Deudas> crear(@RequestBody Deudas p) {
        try {
            return new ResponseEntity<>(deudasService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Metodo para actualizar
    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Deudas p) {
        Deudas deudas = deudasService.findById(id);
        if (deudas == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                deudas.setDeud_institucion(p.getDeud_institucion());
                deudas.setDeud_valor(p.getDeud_valor());
                deudas.setDeud_otorgado(p.getDeud_otorgado());
                deudas.setDeud_destino(p.getDeud_destino());
                deudas.setDeud_saldo(p.getDeud_saldo());
                deudas.setDeud_fechaCorte(p.getDeud_fechaCorte());
                deudas.setDeud_estado(false);
                return new ResponseEntity<>(deudasService.save(deudas), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
