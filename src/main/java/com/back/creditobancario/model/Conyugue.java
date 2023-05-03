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
@Table(name = "conyugue")
public class Conyugue implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "conyID")
    private Long cony_id;

    //nombre
    @Column(name = "conyEstado")
    private Boolean cony_estado;


    //Relaciones
    @OneToOne()
    @JoinColumn(name = "persID")
    private Persona persona;

    @OneToOne()
    @JoinColumn(name = "negoID")
    private Negocio negocio;

    @OneToOne()
    @JoinColumn(name = "emplID")
    private Empleo empleo;

}
