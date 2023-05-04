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
@Table(name = "domicilio")
public class Domicilio  implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "domiID")
    private Long domi_id;

    //color
    @Column(name = "domiColor")
    private String domi_color;

    //tenencia
    @Column(name = "domiTenencia")
    private String domi_tenencia;

    //hipoteca
    @Column(name = "domiHipoteca")
    private Boolean domi_hipoteca;

    //anios_residencia
    @Column(name = "domiAniosResidencia")
    private Integer domi_aniosResidencia;

    //referencia
    @Column(name = "domiReferencia")
    private String domi_referencia;

    //propietario
    @Column(name = "domiPropietario")
    private String domi_propietario;

    //telefono_propietario
    @Column(name = "domiTelefonoPropietario")
    private String domi_telefonPropietario;

    //estado
    @Column(name = "domiEstado")
    private Boolean domi_estado;


    //Relaciones

    //many to one desde direccion
    @ManyToOne
    @JoinColumn(name = "direcID")
    private Direccion direccion;

    //one to one hacia solicitante
    @JsonIgnore
    @OneToOne(mappedBy = "domicilio")
    private Solicitud solicitud;

}
