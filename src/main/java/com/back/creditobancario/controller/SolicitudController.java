package com.back.creditobancario.controller;
//Controlador para Solicitante

//importaciones
import com.back.creditobancario.model.Solicitud;
import com.back.creditobancario.service.Servicios.SolicitudService;
import com.back.creditobancario.service.Servicios.listaSolicitudUserService;
import com.back.creditobancario.views.listaSolicitudUser;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/solicitud")
public class SolicitudController {
    @Autowired
    SolicitudService solicitudService;

    @Autowired
    listaSolicitudUserService userService;

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

    @GetMapping("/listarSolicitudesUsername/{username}")
    public ResponseEntity<List<listaSolicitudUser>> listarSolicitudesUsername(@PathVariable("username") String username) {
        try {
            return new ResponseEntity<>(userService.listarSolicitudesUsername(username), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/listarSolicitudesSucursal/{id}")
    public ResponseEntity<List<listaSolicitudUser>> listarSolicitudesSucursal(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(userService.listarSolicitudesSucursal(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar-id/{id}")
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

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar (@PathVariable Long id, @RequestBody Solicitud p) {
        Solicitud Solicitud = solicitudService.findById(id);
        if (Solicitud == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                Solicitud.setBienesRaices(p.getBienesRaices());
                Solicitud.setBuro(p.getBuro());
                Solicitud.setGastos(p.getGastos());
                Solicitud.setIngresos(p.getIngresos());
                Solicitud.setDomicilio(p.getDomicilio());
                Solicitud.setEmpleo(p.getEmpleo());
                Solicitud.setConyugue(p.getConyugue());
                Solicitud.setPersona(p.getPersona());
                Solicitud.setCredito(p.getCredito());
                Solicitud.setReferenciasBancarias(p.getReferenciasBancarias());
                Solicitud.setVehiculo(p.getVehiculo());
                Solicitud.setDeudas(p.getDeudas());
                Solicitud.setTarjetasCredito(p.getTarjetasCredito());
                Solicitud.setSoli_estadoRegistro(p.getSoli_estadoRegistro());
                Solicitud.setSoli_estado(p.getSoli_estado());
                return new ResponseEntity<>(solicitudService.save(Solicitud), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Solicitud p) {
        Solicitud solicitud = solicitudService.findById(id);
        if (solicitud == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                solicitud.setSoli_estado(false); //cambiar estado a eliminado
                return new ResponseEntity<>(solicitudService.save(solicitud), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

}
