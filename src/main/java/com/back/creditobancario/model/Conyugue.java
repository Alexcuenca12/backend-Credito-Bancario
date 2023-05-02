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
@Table(name = "conyugue")
public class Conyugue implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "conyugueID")
    private Long conyugue_id;

    @Column(name = "conyugueEstado")
    private Boolean conyugue_estado;

    @OneToOne()
    @JoinColumn(name = "perID")
    private Persona persona;

    @OneToOne()
    @JoinColumn(name = "negocioID")
    private Negocio negocio;

    @OneToOne()
    @JoinColumn(name = "empleoID")
    private Empleo empleo;

}
