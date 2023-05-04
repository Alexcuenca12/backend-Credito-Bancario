package com.back.creditobancario.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "solicitante")
public class Solicitante  implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "soliID")
    private Long soli_id;

    //estado
    @Column(name = "soliEstado")
    private Boolean soli_estado;

    //Relaciones

    //one to one desde Buro
    @OneToOne
    @JoinColumn(name = "buroID")
    private Buro buro;

    //one to one desde Gastos
    @OneToOne
    @JoinColumn(name = "gastID")
    private Gastos gastos;

    //one to one desde Ingresos
    @OneToOne
    @JoinColumn(name = "ingrID")
    private Ingresos ingresos;

    //one to one desde Domicilio
    @OneToOne
    @JoinColumn(name = "domiID")
    private Domicilio domicilio;

    //one to one desde Empleo
    @OneToOne
    @JoinColumn(name = "emplID")
    private Empleo empleo;

    //one to one desde Conyugue
    @OneToOne
    @JoinColumn(name = "conyID")
    private Conyugue conyugue;

    //one to one desde Persona
    @OneToOne
    @JoinColumn(name = "persID")
    private Persona persona;

}
