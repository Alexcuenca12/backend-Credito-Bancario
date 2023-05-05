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
@Table(name = "bienes_raices")
public class BienesRaices implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bieRaicID")
    private Long bienRaic_id;

    //tipo
    @Column(name = "bieRaicTipo")
    private String bienRaic_tipo;

    //numero_predio
    @Column(name = "bieRaicNumeroPredio")
    private String bienRaic_numeroPredio;

    //valor
    @Column(name = "bieRaicValor")
    private String bienRaic_valor;

    //hipoteca
    @Column(name = "bieRaicHipoteca")
    private String bienRaic_hipoteca;

    //fecha_adquisicion
    @Column(name = "bieRaicFechaAdquisicion")
    private String bienRaic_fechaAdquisicion;

    //institucion_persona
    @Column(name = "bieRaicInstitucionPersona")
    private String bienRaic_institucionPersona;

    //estado
    @Column(name = "bieRaicEstado")
    private Boolean bienRaic_estado;

    //Relaciones

    //many to one desde solicitud
    @ManyToOne
    @JoinColumn(name = "soliID")
    private Solicitud solicitud;

}
