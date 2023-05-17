package com.back.creditobancario.controller;
//Controlador de Canton

//importaciones
import com.back.creditobancario.model.Canton;
import com.back.creditobancario.model.Provincia;
import com.back.creditobancario.repository.CantonRepository;
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

    @Autowired
    CantonRepository cantonRepository;

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

    @GetMapping("/cantonsByProvince/{id}")
    public List<Canton> getCantonesByProvinciaId(@PathVariable Long id) {
        Provincia provincia = new Provincia();
        provincia.setProv_id(id);
        return cantonRepository.findByProvincia(provincia);
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
//                Canton.setCant_estado(false);
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
                canton.setCant_codigo(p.getCant_codigo());
                canton.setCant_nombre(p.getCant_nombre());
                return new ResponseEntity<>(cantonService.save(canton), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
