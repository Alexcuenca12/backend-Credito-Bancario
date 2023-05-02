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
@Table(name = "burosolicitante")
public class BuroSolicitante implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "buroSolID")
    private Long buroSol_id;

    //deudas_venciadas
    @Column(name = "buroSolDeudasVencidas")
    private String deudas_vencidas;

}
