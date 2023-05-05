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
@Table(name = "destinocredito")
public class DestinoCredito implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "desCredID")
    private Long destCred_id;

    //nombre
    @Column(name = "desCredCategoria")
    private String desCred_categoria;

    //descripcion
    @Column(name = "desCredDescripcion")
    private String desCred_descripcion;

    //estado
    @Column(name = "desCredEstado")
    private Boolean desCred_estado;


}
