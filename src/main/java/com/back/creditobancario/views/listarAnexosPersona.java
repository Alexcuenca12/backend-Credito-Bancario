package com.back.creditobancario.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "listaranexospersona")
@NoArgsConstructor
@AllArgsConstructor
public class listarAnexosPersona {
    @Id
    private Long persid;
    private Long soliid;
    private String Nombres;
    private Double ane_credid;
    private String ane_cred_cedula_conyugue;
    private String ane_cred_cedula_solicitante;
    private Boolean ane_cred_estado;
    private String ane_cred_estado_tarjetas_credito;
    private String ane_cred_facturas_alimentacion;
    private String ane_cred_facturas_educacion;
    private String ane_cred_facturas_otros;
    private String ane_cred_facturas_salud;
    private String ane_cred_facturas_servicios;
    private String ane_cred_matriculas;
    private String ane_cred_predios;
    private String ane_cred_recibos_vivienda;
    private String ane_cred_remesas;
    private String ane_cred_roles_pago;
    private Long credid;
}
