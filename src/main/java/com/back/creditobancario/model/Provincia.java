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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "provID")
    private Long provincia_id;

    @Column(name = "provCod")
    private String provincia_codigo;

    @Column(name = "provNombre")
    private String provincia_nombre;

    @Column(name = "provEstado")
    private Boolean provincia_estado;

    @JsonIgnore
    @OneToMany(mappedBy = "provincia")
    private List<Direccion> direccion;

    @JsonIgnore
    @OneToMany(mappedBy = "provincia")
    private List<Canton> canton;
}
