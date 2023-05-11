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

    //estado
    @Column(name = "parrEstado")
    private Boolean parr_estado;


    //Relaciones
    //many to one desde canton
    @ManyToOne
    @JoinColumn(name = "cantonID")
    private Canton canton;
}
