package com.back.creditobancario.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "gastos")
public class Gastos {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gasID")
    private Long gastos_id;

    //alimentacion
    @Column(name = "gasAlimentacion")
    private String alimentacion;

    //vivienda
    @Column(name = "gasVivienda")
    private String vivienda;

    //salud
    @Column(name = "gasSalud")
    private String salud;

    //educatcion
    @Column(name = "gasEducacion")
    private String educacion;

    //servicios_basicos
    @Column(name = "gasServiciosBasicos")
    private String servicios_basicos;

    //otros
    @Column(name = "gasOtros")
    private String otros;

    //total_gastos
    @Column(name = "gasTotalGastos")
    private String total_gastos;

    //estado
    @Column(name = "gasEstado")
    private Boolean gastos_estado;

}
