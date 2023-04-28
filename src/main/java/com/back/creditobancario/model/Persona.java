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
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "perID")
    private Long persona_id;

    @Column(name = "per_ci")
    private String persona_ci;

    @Column(name = "perNombres")
    private String persona_nombres;

    @Column(name = "perApellidos")
    private String persona_apellidos;

    @Column(name = "perFechaNac")
    private String persona_fechaNac;

    @Column(name = "perSexo")
    private String persona_sexo;

    @Column(name = "perGenero")
    private String persona_genero;

    @Column(name = "perFoto")
    private String persona_foto;

    @Column(name = "perEstadoCivil")
    private String persona_estadoCivil;

    @Column(name = "perNivelInstruccion")
    private String persona_nivelInstruccion;

    @Column(name = "perProfesion")
    private String persona_profesion;

    @Column(name = "perCorreo")
    private String persona_correo;

    @Column(name = "perCelular")
    private String persona_celular;

    @Column(name = "perTelefono")
    private String persona_telefono;

    @Column(name = "perNacionalidad")
    private String persona_nacionalidad;

    @Column(name = "perCodigoPostal")
    private String persona_codigoPostal;

    @Column(name = "perEstado")
    private Boolean persona_estado;

    @JsonIgnore
    @OneToOne(mappedBy = "persona")
    private Usuario usuario;

    @JsonIgnore
    @OneToOne(mappedBy = "persona")
    private Conyugue conyugue;




}
