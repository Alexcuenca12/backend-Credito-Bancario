package com.back.creditobancario.controller;
//Controlador para AnexoCredito

//importaciones
import com.back.creditobancario.model.AnexoCredito;
import com.back.creditobancario.service.Servicios.AnexoCreditoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/anexoCredito")
public class AnexoCreditoController {
    @Autowired
    AnexoCreditoService anexoCreditoService;

    @GetMapping("/listar")
    public ResponseEntity<List<AnexoCredito>> obtenerLista() {
        try {
            return new ResponseEntity<>(anexoCreditoService.findByAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<AnexoCredito> getById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<>(anexoCreditoService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Metodo crear con validaciones
    @PostMapping("/crear")
    public ResponseEntity<?> crear(@RequestBody AnexoCredito p) {
        try {
            if (null == p) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            if (null == p.getAneCred_cedulaSolicitante() || p.getAneCred_cedulaSolicitante().isEmpty()) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            if (null == p.getAneCred_rolesPago() || p.getAneCred_rolesPago().isEmpty()) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            if (null == p.getAneCred_recibosVivienda() || p.getAneCred_recibosVivienda().isEmpty()) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            if (null == p.getAneCred_facturasAlimentacion() || p.getAneCred_facturasAlimentacion().isEmpty()) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            if (null == p.getAneCred_facturasServicios() || p.getAneCred_facturasServicios().isEmpty()) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            if (null == p.getAneCred_facturasSalud() || p.getAneCred_facturasSalud().isEmpty()) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            p.setAneCred_estado(true);
            return new ResponseEntity<>(anexoCreditoService.save(p), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        AnexoCredito anexoCredito = anexoCreditoService.findById(id);
        if (anexoCredito == null) {
            return ResponseEntity.notFound().build();
        } else {
            try {
                anexoCredito.setAneCred_estado(false);
                AnexoCredito anexoCreditoEliminado = anexoCreditoService.save(anexoCredito);
                return ResponseEntity.status(HttpStatus.OK).body(anexoCreditoEliminado);
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
        }
    }

    //Metodo actualizar
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar(@PathVariable("id") Long id, @RequestBody AnexoCredito p) {
        try {
            AnexoCredito anexoCredito = anexoCreditoService.findById(id);
            if (null == anexoCredito) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            anexoCredito.setAneCred_cedulaSolicitante(p.getAneCred_cedulaSolicitante());
            anexoCredito.setAneCred_cedulaConyugue(p.getAneCred_cedulaConyugue());
            anexoCredito.setAneCred_predios(p.getAneCred_predios());
            anexoCredito.setAneCred_matriculas(p.getAneCred_matriculas());
            anexoCredito.setAneCred_rolesPago(p.getAneCred_rolesPago());
            anexoCredito.setAneCred_recibosVivienda(p.getAneCred_recibosVivienda());
            anexoCredito.setAneCred_remesas(p.getAneCred_remesas());
            anexoCredito.setAneCred_estadoTarjetasCredito(p.getAneCred_estadoTarjetasCredito());
            anexoCredito.setAneCred_facturasAlimentacion(p.getAneCred_facturasAlimentacion());
            anexoCredito.setAneCred_facturasServicios(p.getAneCred_facturasServicios());
            anexoCredito.setAneCred_facturasSalud(p.getAneCred_facturasSalud());
            anexoCredito.setAneCred_estado(p.isAneCred_estado());
            return new ResponseEntity<>(anexoCreditoService.save(anexoCredito), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
