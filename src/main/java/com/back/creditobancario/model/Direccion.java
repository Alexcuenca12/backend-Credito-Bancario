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
@Table(name = "direccion")
public class Direccion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "direcID")
    private Long direccion_id;

    @Column(name = "direcCalle")
    private String calle;

    @Column(name = "direcNumero")
    private String numero;

    @Column(name = "direcInterseccion")
    private String interseccion;

    @Column(name = "direcSector")
    private String sector;


    @JsonIgnore
    @OneToOne(mappedBy = "direccion")
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "provID")
    private Provincia provincia;

    @JsonIgnore
    @OneToMany(mappedBy = "direccion")
    private List<Negocio> negocio;

    @JsonIgnore
    @OneToMany(mappedBy = "direccion")
    private List<Empleo> empleo;

    @JsonIgnore
    @OneToMany(mappedBy = "direccion")
    private List<Domicilio> domicilio;
}

