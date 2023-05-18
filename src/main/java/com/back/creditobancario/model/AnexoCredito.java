package com.back.creditobancario.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "anexo_credito")
public class AnexoCredito  implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aneCredID")
    private Long aneCred_id;

    //cedula_solicitante
    @Column(name = "aneCredCedulaSolicitante", columnDefinition = "LONGTEXT")
    private String aneCred_cedulaSolicitante;

    //cedula_conyugue
    @Column(name = "aneCredCedulaConyugue", columnDefinition = "LONGTEXT")
    private String aneCred_cedulaConyugue;

    //predios
    @Column(name = "aneCredPredios", columnDefinition = "LONGTEXT")
    private String aneCred_predios;

    //matriculas
    @Column(name = "aneCredMatriculas", columnDefinition = "LONGTEXT")
    private String aneCred_matriculas;

    //roles_pago
    @Column(name = "aneCredRolesPago", columnDefinition = "LONGTEXT")
    private String aneCred_rolesPago;

    //recibos_vivieda
    @Column(name = "aneCredRecibosVivienda", columnDefinition = "LONGTEXT")
    private String aneCred_recibosVivienda;

    //remesas
    @Column(name = "aneCredRemesas", columnDefinition = "LONGTEXT")
    private String aneCred_remesas;

    //estado_tarjetas_credito
    @Column(name = "aneCredEstadoTarjetasCredito", columnDefinition = "LONGTEXT")
    private String aneCred_estadoTarjetasCredito;

    //facturas_alimentacion
    @Column(name = "aneCredFacturasAlimentacion", columnDefinition = "LONGTEXT")
    private String aneCred_facturasAlimentacion;

    //facturas_servicios
    @Column(name = "aneCredFacturasServicios", columnDefinition = "LONGTEXT")
    private String aneCred_facturasServicios;

    //facturas_salud
    @Column(name = "aneCredFacturasSalud", columnDefinition = "LONGTEXT")
    private String aneCred_facturasSalud;

    //facturas_educacion
    @Column(name = "aneCredFacturasEducacion", columnDefinition = "LONGTEXT")
    private String aneCred_facturasEducacion;

    //facturas_otros
    @Column(name = "aneCredFacturasOtros", columnDefinition = "LONGTEXT")
    private String aneCred_facturasOtros;

    //estado
    @Column(name = "aneCredEstado")
    private boolean aneCred_estado;

    //Relaciones
    //one to one desde credito
    @OneToOne
    @JoinColumn(name = "credID")
    private Credito credito;

}
