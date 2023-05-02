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
@Table(name = "parroquia")
public class Parroquia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parroqID")
    private Long parroquia_id;

    @Column(name = "parroqCod")
    private String parroquia_codigo;

    @Column(name = "parroqNombre")
    private String parroquia_nombre;

    @Column(name = "parroquiaEstado")
    private Boolean parroquia_estado;

    @ManyToOne
    @JoinColumn(name = "cantonID")
    private Canton canton;
}
