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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "refBancID")
    private Long refBanc_id;

    @Column(name = "refBancNombre")
    private String nombre;

    @Column(name = "refBancNumero")
    private String numero;

    @Column(name = "refBancTipo")
    private String tipo;

    @Column(name = "refBancApertura")
    private String apertura;

    @Column(name = "refBancCifrasPromedio")
    private String cifras_promedio;

    @Column(name = "refBancSaldo")
    private String saldo;
}
