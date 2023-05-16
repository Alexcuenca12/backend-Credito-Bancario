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
@Table(name = "provincia")
public class Provincia implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "provId")
    private Long prov_id;

    //codigo
    @Column(name = "provCod")
    private String prov_codigo;

    //nombre
    @Column(name = "provNombre")
    private String prov_nombre;

    //Relaciones
    //one to many hacia direccion
    @JsonIgnore
    @OneToMany(mappedBy = "provincia")
    private List<Direccion> direccion;

    //many to one desde canton
    @JsonIgnore
    @OneToMany(mappedBy = "provincia")
    private List<Canton>canton;
}
