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

    //estado
    @Column(name = "soliEstado")
    private String soli_estado;

    //Relacionesi
    //one to many hacia BienesRaices
    @JsonIgnore
    @OneToMany(mappedBy = "solicitud")
    private List<BienesRaices> bienes_raices;

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
    @JsonIgnore
    @OneToMany(mappedBy = "solicitud")
    private List<ReferenciasBancarias> referencias_bancarias;

    //many to one desde Vehiculo
    @ManyToOne
    @JoinColumn(name = "vehiID")
    private Vehiculo vehiculo;

    //many to one desde Deudas
    @ManyToOne
    @JoinColumn(name = "deudID")
    private Deudas deudas;

    //one to many hacia TarjetasCredito
    @OneToMany(mappedBy = "solicitud")
    private List<TarjetasCredito> tarjetas_credito;
}
