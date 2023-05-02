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
@Table(name = "tablasolicitante")
public class TablaSolicitante  implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tabSolID")
    private Long tabSol_id;

    //score
    @Column(name = "tabSolScore")
    private String score;

    //calificacion
    @Column(name = "tabSolCalificacion")
    private String calificacion;
}
