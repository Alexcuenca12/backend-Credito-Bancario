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

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credID")
    private Long cred_id;

    //fecha
    @Column(name = "credFecha")
    private String cred_fecha;

    //monto
    @Column(name = "credMonto")
    private String cred_monto;

    //plazo
    @Column(name = "credPlazo")
    private String cred_plazo;

    //numero
    @Column(name = "credNumero")
    private String cred_numero;

    //estado
    @Column(name = "credEstado")
    private Boolean cred_estado;


    //Relaciones
    @ManyToOne
    @JoinColumn(name = "sucursalID")
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "destCredID")
    private DestinoCredito destino_credito;

}
