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
@Table(name = "parroquia")
public class Parroquia implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parrID")
    private Long parr_id;

    //codigo
    @Column(name = "parrCod")
    private String parr_codigo;

    //nombre
    @Column(name = "parrNombre")
    private String parr_nombre;

    //Relaciones

    //one to many hacia Canton
    @ManyToOne
    @JoinColumn(name = "cantID")
    private Canton canton;
}
