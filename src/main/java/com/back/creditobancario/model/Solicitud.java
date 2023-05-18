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
@Table(name = "solicitud")
public class Solicitud implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "soliID")
    private Long soli_id;

    //estadoRegistro
    @Column(name = "soliEstadoRegistro")
    private String soli_estadoRegistro;

    //estado
    @Column(name = "soliEstado")
    private String soli_estado;

    //Relaciones
    //one to many hacia BienesRaices
    @ManyToOne
    @JoinColumn(name = "bieRaicID")
    private BienesRaices bienesRaices;

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

    //many to one desde Credito
    @ManyToOne
    @JoinColumn(name = "credID")
    private Credito credito;

    //one to many hacia ReferenciasPersonales
    @ManyToOne
    @JoinColumn(name = "refBancID")
    private ReferenciasBancarias referenciasBancarias;

    //many to one desde Vehiculo
    @ManyToOne
    @JoinColumn(name = "vehiID")
    private Vehiculo vehiculo;

    //many to one desde Deudas
    @ManyToOne
    @JoinColumn(name = "deudID")
    private Deudas deudas;

    @ManyToOne
    @JoinColumn(name = "tarCred_id")
    private TarjetasCredito tarjetasCredito;

    //one to meny hacia Control
    @OneToMany(mappedBy = "solicitud")
    @JsonIgnore
    private List<ControlCredito> controlCreditos;
}
