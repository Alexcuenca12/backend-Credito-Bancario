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
@Table(name = "credito")
public class Credito implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credID")
    private Long credito_id;

    @Column(name = "credFecha")
    private String fecha_credito;

    @Column(name = "credMonto")
    private String monto;

    @Column(name = "credPlazo")
    private String plazo;

    @Column(name = "credNumero")
    private String numero_credito;

    @Column(name = "credEstado")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "sucursalID")
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "destCredID")
    private DestinoCredito destino_credito;

    /*@ManyToOne
    @JoinColumn(name = "soliID")
    private Solicitante solicitante;*/

}
