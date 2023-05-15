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

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "direId")
    private Long dire_id;

    //calle
    @Column(name = "direCalle")
    private String dire_calle;

    //numero
    @Column(name = "direNumero")
    private String dire_numero;

    //interseccion
    @Column(name = "direInterseccion")
    private String dire_interseccion;

    //sector
    @Column(name = "direSector")
    private String dire_sector;

    //estado
    @Column(name = "direEstado")
    private Boolean dire_estado;

    //Relaciones

    //one to one hacia sucursal
    @JsonIgnore
    @OneToOne(mappedBy = "direccion")
    private Sucursal sucursal;

    //one to many hacia negocio
    @JsonIgnore
    @OneToMany(mappedBy = "direccion")
    private List<Negocio> negocio;

    //one to many hacia empleo
    @JsonIgnore
    @OneToMany(mappedBy = "direccion")
    private List<Empleo> empleo;

    //one to many hacia domicilio
    @JsonIgnore
    @OneToMany(mappedBy = "direccion")
    private List<Domicilio> domicilio;

    //many to one desde provincia
    @ManyToOne
    @JoinColumn(name = "provId")
    private Provincia provincia;
}

