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
@Table(name = "negocio")
public class Negocio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "negocioID")
    private Long negocio_id;

    @Column(name = "negocioTipo")
    private String negocio_tipo;

    @Column(name = "negocioNombre")
    private String negocio_nombre;

    @Column(name = "negocioActividad")
    private String negocio_actividad;

    @Column(name = "negocioTiempo")
    private Integer negocio_tiempo;

    @Column(name = "negocioEstado")
    private Boolean negocio_estado;

    @ManyToOne
    @JoinColumn(name = "direcID")
    private Direccion direccion;

    @JsonIgnore
    @OneToOne(mappedBy = "negocio")
    private Conyugue conyugue;


}
