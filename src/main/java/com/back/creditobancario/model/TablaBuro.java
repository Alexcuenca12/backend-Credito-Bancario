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
@Table(name = "tablaBuro")
public class TablaBuro implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tabBuro_id")
    private Long tabBuro_id;

    //score
    @Column(name = "tabBuroScore")
    private String tabBuro_score;

    //calificacion
    @Column(name = "tabBuroCalificacion")
    private String tabBuro_calificacion;

    //estado
    @Column(name = "tabBuroEstado")
    private Boolean tabBuro_estado;

}
