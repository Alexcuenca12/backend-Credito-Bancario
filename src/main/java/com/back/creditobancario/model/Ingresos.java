package com.back.creditobancario.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ingresos")
public class Ingresos implements Serializable {
    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ingID")
    private Long ingresos_id;

    //sueldo_mensual
    @Column(name = "ingSueldoMensual")
    private String sueldo_mensual;

    //sueldo_conyugue
    @Column(name = "ingSueldoConyugue")
    private String sueldo_conyugue;

    //remesas
    @Column(name = "ingRemesas")
    private String remesas;

    //pension_jubilados
    @Column(name = "ingPensionJubilados")
    private String pension_jubilados;

    //ingresos_servicios
    @Column(name = "ingIngresosServicios")
    private String ingresos_servicios;

    //otros_ingresos
    @Column(name = "ingOtrosIngresos")
    private String otros_ingresos;

    //total_ingresos
    @Column(name = "ingTotalIngresos")
    private String total_ingresos;

    //estado
    @Column(name = "ingEstado")
    private Boolean ingresos_estado;

}
