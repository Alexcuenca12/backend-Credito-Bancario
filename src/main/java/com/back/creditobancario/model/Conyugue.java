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
@Table(name = "conyugue")
public class Conyugue implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "conyID")
    private Long cony_id;

    //estado
    @Column(name = "conyEstado")
    private Boolean cony_estado;


    //Relaciones

    //one to one desde persona
    @OneToOne()
    @JoinColumn(name = "persID")
    private Persona persona;

    //one to one desde negocio
    @OneToOne()
    @JoinColumn(name = "negoID")
    private Negocio negocio;

    //one to one desde empleo
    @OneToOne()
    @JoinColumn(name = "emplID")
    private Empleo empleo;

    //one to one hacia solicitante
    @JsonIgnore
    @OneToOne(mappedBy = "conyugue")
    private Solicitud solicitud;

}
