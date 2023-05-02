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
@Table(name = "deudas")
public class Deudas implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deuID")
    private Long deudas_id;

    //fecha_corte
    @Column(name = "deuFechaCorte")
    private String fecha_corte;

    //institucion
    @Column(name = "deuInstitucion")
    private String institucion;

    //valor
    @Column(name = "deuValor")
    private String valor;

    //otorgado
    @Column(name = "deuOtorgado")
    private String otorgado;

    //destino
    @Column(name = "deuDestino")
    private String destino;

    //saldo
    @Column(name = "deuSaldo")
    private String saldo;

    //estado
    @Column(name = "deuEstado")
    private Boolean deudas_estado;

}
