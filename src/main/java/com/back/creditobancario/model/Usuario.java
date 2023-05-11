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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuarioID")
    private Long usuario_id;

    @Column(name = "usuarioUsername")
    private String username;
    @Column(name = "usuarioPassword")
    private String password;

    //fecha_registro
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "usuarioRegistro")
    private Date fecha_registro;

    @Column(name = "usuarioPreg_uno")
    private String pregunta_uno;

    @Column(name = "usuarioPreg_dos")
    private String pregunta_dos;

    @Column(name = "usuarioEstado")
    private Boolean usuario_estado;

    //Relaciones

    //one to one desde persona
    @OneToOne()
    @JoinColumn(name = "perID")
    private Persona persona;

    //many to one desde rol
    @ManyToOne
    @JoinColumn(name = "rolID")
    private Rol rol;

    //one to one hacia sucursal
    @JsonIgnore
    @OneToOne(mappedBy = "usuario")
    private Sucursal sucursal;

}
