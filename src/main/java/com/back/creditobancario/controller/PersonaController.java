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
            return new ResponseEntity<>(personaService.listar(), HttpStatus.OK);
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
                persona.setPersona_estado(false);
                return new ResponseEntity<>(personaService.save(persona), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Persona> actualizarUsuario(@PathVariable Long id, @RequestBody Persona p) {
        Persona persona = personaService.findById(id);
        if (persona == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                persona.setPersona_ci(p.getPersona_ci());
                persona.setPersona_nombres(p.getPersona_nombres());
                persona.setPersona_apellidos(p.getPersona_apellidos());
                persona.setPersona_fechaNac(p.getPersona_fechaNac());
                persona.setPersona_sexo(p.getPersona_sexo());
                persona.setPersona_genero(p.getPersona_genero());
                persona.setPersona_foto(p.getPersona_foto());
                persona.setPersona_estadoCivil(p.getPersona_estadoCivil());
                persona.setPersona_nivelInstruccion(p.getPersona_nivelInstruccion());
                persona.setPersona_profesion(p.getPersona_profesion());
                persona.setPersona_correo(p.getPersona_correo());
                persona.setPersona_celular(p.getPersona_celular());
                persona.setPersona_telefono(p.getPersona_telefono());
                persona.setPersona_nacionalidad(p.getPersona_nacionalidad());
                persona.setPersona_codigoPostal(p.getPersona_codigoPostal());

                return new ResponseEntity<>(personaService.save(persona), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
