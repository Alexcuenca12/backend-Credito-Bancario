package com.back.creditobancario.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private Double ingr_sueldoMensual;

    //sueldo_conyugue
    @Column(name = "ingrSueldoConyugue")
    private Double ingr_sueldoConyugue;

    //remesas
    @Column(name = "ingrRemesas")
    private Double ingr_remesas;

    //pension_jubilados
    @Column(name = "ingrPensionJubilados")
    private Double ingr_pensionJubilados;

    //ingresos_servicios
    @Column(name = "ingrIngresosServicios")
    private Double ingr_ingresosServicios;

    //otros_ingresos
    @Column(name = "ingrOtrosIngresos")
    private Double ingr_otrosIngresos;

    //total_ingresos
    @Column(name = "ingrTotalIngresos")
    private Double ingr_totalIngresos;

    //estado
    @Column(name = "ingrEstado")
    private Boolean ingr_estado;

    //Relaciones

    //one to one hacia solicitante
    @JsonIgnore
    @OneToOne(mappedBy = "ingresos")
    private Solicitud solicitud;

}
