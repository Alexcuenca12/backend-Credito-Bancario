package com.back.creditobancario.controller;
//Controlador para Solicitante

//importaciones
import com.back.creditobancario.model.Solicitud;
import com.back.creditobancario.service.Servicios.SolicitudService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/solicitante")
public class SolicitudController {
    @Autowired
    SolicitudService solicitudService;

    @GetMapping("/listar")
    public ResponseEntity<List<Solicitud>> obtenerLista() {
        try {
            return new ResponseEntity<>(solicitudService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listarSoliEstado")
    public ResponseEntity<List<Solicitud>> listarSolicitudesEstado() {
        try {
            return new ResponseEntity<>(solicitudService.listarSolicitudesEstado(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Solicitud> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(solicitudService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Solicitud> crear(@RequestBody Solicitud p) {
        try {
            return new ResponseEntity<>(solicitudService.save(p), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> actualizar (@PathVariable Long id, @RequestBody Solicitud p) {
        Solicitud Solicitud = solicitudService.findById(id);
        if (Solicitud == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                Solicitud.setBienes_raices(p.getBienes_raices());
                Solicitud.setBuro(p.getBuro());
                Solicitud.setGastos(p.getGastos());
                Solicitud.setIngresos(p.getIngresos());
                Solicitud.setDomicilio(p.getDomicilio());
                Solicitud.setEmpleo(p.getEmpleo());
                Solicitud.setConyugue(p.getConyugue());
                Solicitud.setPersona(p.getPersona());
                Solicitud.setCredito(p.getCredito());
                Solicitud.setReferencias_bancarias(p.getReferencias_bancarias());
                Solicitud.setVehiculo(p.getVehiculo());
                Solicitud.setDeudas(p.getDeudas());
                Solicitud.setTarjetas_credito(p.getTarjetas_credito());
                return new ResponseEntity<>(solicitudService.save(Solicitud), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Solicitud p) {
        Solicitud Solicitud = solicitudService.findById(id);
        if (Solicitud == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
//                Solicitud.setSoli_estado(false);
                return new ResponseEntity<>(solicitudService.save(Solicitud), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

}
