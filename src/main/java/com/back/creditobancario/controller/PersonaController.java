package com.back.creditobancario.controller;

import com.back.creditobancario.model.Persona;
import com.back.creditobancario.service.Servicios.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/persona")
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Persona>> obtenerLista() {
        try {
            return new ResponseEntity<>(personaService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/buscar/{id}")
    public ResponseEntity<Persona> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(personaService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/crear")
    public ResponseEntity<Persona> crear(@RequestBody Persona p) {
        try {
            return new ResponseEntity<>(personaService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Persona p) {
        Persona persona = personaService.findById(id);
        if (persona == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                persona.setPers_estado(false);
                return new ResponseEntity<>(personaService.save(persona), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Persona> actualizarPersona(@PathVariable Long id, @RequestBody Persona p) {
        Persona persona = personaService.findById(id);
        if (persona == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                persona.setPers_cedula(p.getPers_cedula());
                persona.setPers_nombres(p.getPers_nombres());
                persona.setPers_apellidos(p.getPers_apellidos());
                persona.setPers_fechaNacimiento(p.getPers_fechaNacimiento());
                persona.setPers_sexo(p.getPers_sexo());
                persona.setPers_genero(p.getPers_genero());
                persona.setPers_foto(p.getPers_foto());
                persona.setPers_estadoCivil(p.getPers_estadoCivil());
                persona.setPers_nivelInstruccion(p.getPers_nivelInstruccion());
                persona.setPers_profesion(p.getPers_profesion());
                persona.setPers_correo(p.getPers_correo());
                persona.setPers_celular(p.getPers_celular());
                persona.setPers_telefono(p.getPers_telefono());
                persona.setPers_nacionalidad(p.getPers_nacionalidad());
                persona.setPers_codigoPostal(p.getPers_codigoPostal());
                return new ResponseEntity<>(personaService.save(persona), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
