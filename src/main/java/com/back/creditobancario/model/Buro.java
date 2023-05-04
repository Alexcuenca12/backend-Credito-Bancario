package com.back.creditobancario.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private String buro_deudasVencidas;

    //estado
    @Column(name = "buroEstado")
    private Boolean buro_estado;

    //Relaciones

    //one to one desde tablaBuro
    @OneToOne
    @JoinColumn(name = "tabBuroID")
    private TablaBuro tablaBuro;

    //one to one hacia solicitante
    @JsonIgnore
    @OneToOne(mappedBy = "buro")
    private Solicitante solicitante;

}
