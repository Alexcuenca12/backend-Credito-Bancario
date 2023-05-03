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
@Table(name = "referenciasbancarias")
public class ReferenciasBancarias implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "refBancID")
    private Long refBanc_id;

    //nombre
    @Column(name = "refBancNombre")
    private String nombre;

    //numero
    @Column(name = "refBancNumero")
    private String numero;

    //tipo
    @Column(name = "refBancTipo")
    private String tipo;

    //apertura
    @Column(name = "refBancApertura")
    private String apertura;

    //cifras_promedio
    @Column(name = "refBancCifrasPromedio")
    private String cifras_promedio;

    //saldo
    @Column(name = "refBancSaldo")
    private String saldo;

    //estado
    @Column(name = "refBancEstado")
    private Boolean refBanc_estado;


}
