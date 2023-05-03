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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "destCredID")
    private Long destCred_id;

    @Column(name = "destCredCategoria")
    private String categoria;

    @Column(name = "destCredDescripcion")
    private String descripcion;

    //estado
    @Column(name = "destCredEstado")
    private Boolean destCred_estado;


}
