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
    @Column(name = "tarCreID")
    private Long tarjetas_credito_id;

    //banco
    @Column(name = "tarCreBanco")
    private String banco;

    //numero
    @Column(name = "tarCreNumero")
    private String numero;

    //cauduca
    @Column(name = "tarCreCauduca")
    private String cauduca;

    //cupo
    @Column(name = "tarCreCupo")
    private String cupo;

    //utilizado
    @Column(name = "tarCreUtilizado")
    private String utilizado;

    //cuota
    @Column(name = "tarCreCuota")
    private String cuota;

}
