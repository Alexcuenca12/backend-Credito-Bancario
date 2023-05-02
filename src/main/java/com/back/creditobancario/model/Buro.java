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
@Table(name = "buro")
public class Buro implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "buroID")
    private Long buro_id;

    //deudas_venciadas
    @Column(name = "buroDeudasVencidas")
    private String deudas_vencidas;

    //estado
    @Column(name = "buroEstado")
    private Boolean buro_estado;

}
