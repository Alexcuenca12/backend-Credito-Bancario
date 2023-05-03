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
    @Column(name = "ingrID")
    private Long ingr_id;

    //sueldo_mensual
    @Column(name = "ingrSueldoMensual")
    private String ingr_sueldoMensual;

    //sueldo_conyugue
    @Column(name = "ingrSueldoConyugue")
    private String ingr_sueldoConyugue;

    //remesas
    @Column(name = "ingrRemesas")
    private String ingr_remesas;

    //pension_jubilados
    @Column(name = "ingrPensionJubilados")
    private String ingr_pensionJubilados;

    //ingresos_servicios
    @Column(name = "ingrIngresosServicios")
    private String ingr_ingresosServicios;

    //otros_ingresos
    @Column(name = "ingrOtrosIngresos")
    private String ingr_otrosIngresos;

    //total_ingresos
    @Column(name = "ingrTotalIngresos")
    private String ingr_totalIngresos;

    //estado
    @Column(name = "ingrEstado")
    private Boolean ingr_estado;

}
