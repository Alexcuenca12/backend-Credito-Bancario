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
@Table(name = "controlCredito")
public class ControlCredito implements Serializable {

    private static final long serialVersionUID = 1L;
    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "controlID")
    private Long controlID;

    @Column(name = "solicitudCredito", columnDefinition = "LONGTEXT")
    private String solicitudCredito;

    @Column(name = "ListaVerificacion", columnDefinition = "LONGTEXT")
    private String ListaVerificacion;

    @Column(name = "resumenEstado", columnDefinition = "LONGTEXT")
    private String resumenEstado;

    @Column(name = "cuadroCumplimiento", columnDefinition = "LONGTEXT")
    private String cuadroCumplimiento;

    @Column(name = "correoRechazo", columnDefinition = "LONGTEXT")
    private String correoRechazo;

    @Column(name = "controlEstado")
    private Boolean controlEstado;

    @ManyToOne
    @JoinColumn(name = "soliID")
    private Solicitud solicitud;

}
