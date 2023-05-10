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
    private String refBanc_nombre;

    //numero
    @Column(name = "refBancNumero")
    private String refBanc_numero;

    //tipo
    @Column(name = "refBancTipo")
    private String refBanc_tipo;

    //apertura
    @Column(name = "refBancApertura")
    private String refBanc_apertura;

    //cifras_promedio
    @Column(name = "refBancCifrasPromedio")
    private Double refBanc_cifrasPromedio;

    //saldo
    @Column(name = "refBancSaldo")
    private Double refBanc_saldo;

    //estado
    @Column(name = "refBancEstado")
    private Boolean refBanc_estado;

    //Relaciones

    //many to one desde solicitud
    @ManyToOne
    @JoinColumn(name = "soliID")
    private Solicitud solicitud;


}
