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
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuarioID")
    private Long usuario_id;

    @Column(name = "usuarioUsername", unique = true)
    private String username;

    @Column(name = "usuarioPassword")
    private String password;

    //fecha_registro
    @Column(name = "usuarioRegistro")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date fecha_registro;

    @Column(name = "usuarioPreg_uno")
    private String preguntaUno;

    @Column(name = "usuarioPreg_dos")
    private String preguntaDos;

    @Column(name = "usuarioEstado")
    private Boolean usuario_estado;

    //Relaciones

    //one to one desde persona
    @OneToOne()
    @JoinColumn(name = "persID")
    private Persona persona;

    //many to one desde rol
    @ManyToOne
    @JoinColumn(name = "rolID")
    private Rol rol;

    //one to one hacia sucursal
    @OneToOne()
    @JoinColumn(name = "sucursalID")
    @JsonIgnore
    private Sucursal sucursal;

}
