package com.back.creditobancario.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(name = "gastID")
    private Long gast_id;

    //alimentacion
    @Column(name = "gastAlimentacion")
    private String gast_alimentacion;

    //vivienda
    @Column(name = "gastVivienda")
    private String gast_vivienda;

    //salud
    @Column(name = "gastSalud")
    private String gast_salud;

    //educatcion
    @Column(name = "gastEducacion")
    private String gast_educacion;

    //servicios_basicos
    @Column(name = "gastServiciosBasicos")
    private String gast_serviciosBasicos;

    //otros
    @Column(name = "gastOtros")
    private String gast_otros;

    //total_gastos
    @Column(name = "gastTotalGastos")
    private String gast_totalGastos;

    //estado
    @Column(name = "gastEstado")
    private Boolean gast_estado;

    //Relaciones

    //one to one hacia solicitante
    @JsonIgnore
    @OneToOne(mappedBy = "gastos")
    private Solicitud solicitud;

}
