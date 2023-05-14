package com.back.creditobancario.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "persID")
    private Long pers_id;

    //cedula
    @Column(name = "perCedula")
    private String pers_cedula;

    //nombres
    @Column(name = "persNombres")
    private String pers_nombres;

    //apellidos
    @Column(name = "persApellidos")
    private String pers_apellidos;

    //fecha_nacimiento
    @Column(name = "persFechaNacimiento")

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date pers_fechaNacimiento;

    //sexo
    @Column(name = "persSexo")
    private String pers_sexo;

    //genero
    @Column(name = "persGenero")
    private String pers_genero;

    //foto
    @Column(name = "persFoto", columnDefinition = "LONGTEXT")
    private String pers_foto;

    //estado_civil
    @Column(name = "persEstadoCivil")
    private String pers_estadoCivil;

    //nivel_instruccion
    @Column(name = "persNivelInstruccion")
    private String pers_nivelInstruccion;

    //profesion
    @Column(name = "persProfesion")
    private String pers_profesion;

    //correo
    @Column(name = "persCorreo")
    private String pers_correo;

    //celular
    @Column(name = "persCelular")
    private String pers_celular;

    //telefono
    @Column(name = "persTelefono")
    private String pers_telefono;

    //nationalidad
    @Column(name = "persNacionalidad")
    private String pers_nacionalidad;

    //codigo_postal
    @Column(name = "persCodigoPostal")
    private String pers_codigoPostal;

    //estado
    @Column(name = "persEstado")
    private Boolean pers_estado;


    //Relaciones

    //one to one hacia Usuario
    @JsonIgnore
    @OneToOne(mappedBy = "persona")
    private Usuario usuario;

    //one to one hacia Conyugue
    @JsonIgnore
    @OneToOne(mappedBy = "persona")
    private Conyugue conyugue;

    //one to one hacia Solicitante
    @JsonIgnore
    @OneToOne(mappedBy = "persona")
    private Solicitud solicitud;

}
