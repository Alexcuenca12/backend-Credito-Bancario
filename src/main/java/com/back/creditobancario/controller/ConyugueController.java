package com.back.creditobancario.controller;


import com.back.creditobancario.model.*;
import com.back.creditobancario.repository.*;
import com.back.creditobancario.service.Servicios.ConyugueService;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/conyugue")
public class ConyugueController {
    @Autowired
    ConyugueService conyugueService;
    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
    private EmpleoRepository empleoRepository;
    @Autowired
    private NegocioRepository negocioRepository;
    @Autowired
    private DireccionRepository direccionRepository;
    @Autowired
    private ProvinciaRepository provinciaRepository;

    private JsonMapper mapper;
    @Autowired
    private ConyugueRepository conyugueRepository;

    @GetMapping("/listar")
    public ResponseEntity<List<Conyugue>> obtenerLista() {
        try {
            return new ResponseEntity<>(conyugueService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/buscar/{id}")
    public ResponseEntity<Conyugue> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(conyugueService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


//    @PostMapping("/crear")
//    public ResponseEntity<Conyugue> crear(@RequestBody Conyugue c) {
//        try {
//            return new ResponseEntity<>(conyugueService.save(c), HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

    @PostMapping("/crear")
    public ResponseEntity<Conyugue> crear(@RequestBody Conyugue c) {
        try {
            // Verificar si la persona ya ha sido guardada en la base de datos
            Persona persona = c.getPersona();
            if (null !=  persona  && null == persona.getPers_id()  ) {
                Persona personaObject = personaRepository.save(persona);
                // Si la persona no ha sido guardada en la base de datos, guardarla primero
                c.setPersona(personaObject);
            }

            // Guardar el negocio en la base de datos
            Negocio negocio = c.getNegocio();

            // Verificar si ya existe la dirección del negocio y crearla si no existe
            Direccion dirNegocio = negocio.getDireccion();
            Provincia provNegocio = dirNegocio.getProvincia();
            Optional<Direccion> optionalDirNegocio = direccionRepository.findByDireCalleAndDireNumeroAndDireInterseccionAndDireSectorAndProvincia(
                    dirNegocio.getDireCalle(),
                    dirNegocio.getDireNumero(),
                    dirNegocio.getDireInterseccion(),
                    dirNegocio.getDireSector(),
                    provNegocio);

            if (optionalDirNegocio.isPresent()) {
                dirNegocio = optionalDirNegocio.get();
            } else {
                dirNegocio = direccionRepository.save(dirNegocio);
            }

            negocio.setDireccion(dirNegocio);
            negocioRepository.save(negocio);

            // Actualizar el negocio en el objeto conyugue con el ID asignado por la base de datos
            c.setNegocio(negocio);

            // Guardar el empleo en la base de datos
            Empleo empleo = c.getEmpleo();

            // Verificar si ya existe la dirección del empleo y crearla si no existe
            Direccion dirEmpleo = empleo.getDireccion();
            Provincia provEmpleo = dirEmpleo.getProvincia();
            Optional<Direccion> optionalDirEmpleo = direccionRepository.findByDireCalleAndDireNumeroAndDireInterseccionAndDireSectorAndProvincia(
                    dirEmpleo.getDireCalle(),
                    dirEmpleo.getDireNumero(),
                    dirEmpleo.getDireInterseccion(),
                    dirEmpleo.getDireSector(),
                    provEmpleo);

            if (optionalDirEmpleo.isPresent()) {
                dirEmpleo = optionalDirEmpleo.get();
            } else {
                dirEmpleo = direccionRepository.save(dirEmpleo);
            }

            empleo.setDireccion(dirEmpleo);
            empleoRepository.save(empleo);

            // Actualizar el empleo en el objeto conyugue con el ID asignado por la base de datos
            c.setEmpleo(empleo);

            // Guardar el conyugue en la base de datos
            Conyugue conyugue = conyugueRepository.save(c);
            return new ResponseEntity<>(conyugue, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


//    private void actualizarProvincia(Provincia provincia) {
//        if (provincia != null) {
//            Optional<Provincia> provinciaExistente = provinciaRepository.findById(provincia.getProv_id());
//            if (provinciaExistente.isPresent()) {
//                provincia.setProv_id(provinciaExistente.get().getProv_id());
//            } else {
//                provinciaRepository.save(provincia);
//            }
//        }
//    }







    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Conyugue p) {
        Conyugue conyugue = conyugueService.findById(id);
        if (conyugue == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                conyugue.setCony_estado(false);
                return new ResponseEntity<>(conyugueService.save(conyugue), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Conyugue> actualizarConyugue(@PathVariable Long id, @RequestBody Conyugue p) {
        Conyugue conyugue = conyugueService.findById(id);
        if (conyugue == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {

                return new ResponseEntity<>(conyugueService.save(conyugue), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
