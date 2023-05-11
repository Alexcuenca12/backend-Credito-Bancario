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

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "negoID")
    private Long nego_id;

    //tipo
    @Column(name = "negoTipo")
    private String nego_tipo;

    //nombre
    @Column(name = "negoNombre")
    private String nego_nombre;

    //actividad
    @Column(name = "negoActividad")
    private String nego_actividad;

    //tiempo
    @Column(name = "negoTiempo")
    private Integer nego_tiempo;

    //estado
    @Column(name = "negoEstado")
    private Boolean nego_estado;

    //Relaciones
    //many to one desde direccion
    @ManyToOne
    @JoinColumn(name = "direcID")
    private Direccion direccion;

    //one to one hacia conyugue
    @JsonIgnore
    @OneToOne(mappedBy = "negocio")
    private Conyugue conyugue;

}
