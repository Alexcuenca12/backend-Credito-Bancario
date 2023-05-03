package com.back.creditobancario.model;

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
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuaID")
    private Long usua_id;

    //username
    @Column(name = "usuaUsername")
    private String usua_username;

    //password
    @Column(name = "usuaPassword")
    private String usua_password;

    //fecha_registro
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "usuaRegistro")
    private Date usua_fechaRegistro;

    //pregunta_uno
    @Column(name = "usuaPreguntaUno")
    private String usua_preguntaUno;

    //pregunta_dos
    @Column(name = "usuaPreguntaDos")
    private String usua_PreguntaDos;

    //estado
    @Column(name = "usuaEstado")
    private Boolean usua_estado;


    //Relaciones
    @OneToOne()
    @JoinColumn(name = "perID")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "rolID")
    private Rol rol;

    @JsonIgnore
    @OneToOne(mappedBy = "usuario")
    private Sucursal sucursal;

}
