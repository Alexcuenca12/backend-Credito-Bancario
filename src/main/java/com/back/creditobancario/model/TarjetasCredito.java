package com.back.creditobancario.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tarjetascredito")
public class TarjetasCredito {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tarCredID")
    private Long tarCred_id;

    //banco
    @Column(name = "tarCredBanco")
    private String tarCred_banco;

    //numero
    @Column(name = "tarCredNumero")
    private String tarCred_numero;

    //cauducidad
    @Column(name = "tarCredCauducidad")
    private String tarCred_cauducidad;

    //cupo
    @Column(name = "tarCredCupo")
    private String tarCred_cupo;

    //utilizado
    @Column(name = "tarCredUtilizado")
    private String tarCred_utilizado;

    //cuota
    @Column(name = "tarCredCuota")
    private String tarCred_cuota;

    //estado
    @Column(name = "tarCredEstado")
    private Boolean tarCred_estado;


}
