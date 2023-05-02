package com.back.creditobancario.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rol")
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rolID")
    private Long rol_id;

    @Column(name = "rolNombre")
    private String rol_nombre;

    @Column(name = "rolDescripcion")
    private String rol_descripcion;

    @Column(name = "rolEstado")
    private Boolean rol_estado;

    @JsonIgnore
    @OneToMany(mappedBy = "rol")
    private List<Usuario> usuario;

}
