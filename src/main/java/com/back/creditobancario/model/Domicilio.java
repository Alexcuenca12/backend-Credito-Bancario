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
@Table(name = "domicilio")
public class Domicilio  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "domicilioID")
    private Long domicilio_id;

    @Column(name = "domicilioColor")
    private String domicilio_color;

    @Column(name = "domicilioTenencia")
    private String domicilio_tenencia;

    @Column(name = "domicilioHipoteca")
    private Boolean domicilio_hipoteca;

    @Column(name = "domicilioAniosResidencia")
    private Integer domicilio_aniosresidencia;

    @Column(name = "domicilioReferencia")
    private String domicilio_referencia;

    @Column(name = "domicilioPropietario")
    private String domicilio_propietario;

    @Column(name = "domicilioTlfnPropietario")
    private String domicilio_tlfnPropietario;

    @ManyToOne
    @JoinColumn(name = "direcID")
    private Direccion direccion;
}
