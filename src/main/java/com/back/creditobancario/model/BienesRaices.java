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
@Table(name = "bienesraices")
public class BienesRaices implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bieRaicID")
    private Long bienes_raices_id;

    //tipo
    @Column(name = "bieRaicTipo")
    private String tipo;

    //numero_predio
    @Column(name = "bieRaicNumeroPredio")
    private String numero_predio;

    //valor
    @Column(name = "bieRaicValor")
    private String valor;

    //hipoteca
    @Column(name = "bieRaicHipoteca")
    private String hipoteca;

    //fecha_adquisicion
    @Column(name = "bieRaicFechaAdquisicion")
    private String fecha_adquisicion;

    //institucion_persona
    @Column(name = "bieRaicInstitucionPersona")
    private String institucion_persona;

    //estado
    @Column(name = "bieRaicEstado")
    private Boolean bienes_raices_estado;

}
