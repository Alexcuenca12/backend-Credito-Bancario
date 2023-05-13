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
@Table(name = "sucursal")
public class Sucursal implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sucuID")
    private Long sucu_id;

    //codigo
    @Column(name = "sucuCodigo")
    private String sucu_codigo;

    //estado
    @Column(name = "sucuEstado")
    private Boolean sucu_estado;


    //Relaciones

    //one to one desde usuario
    @OneToOne()
    @JoinColumn(name = "usuarioID")
    @JsonIgnore
    private Usuario usuario;

    //one to one desde direccion
    @OneToOne()
    @JoinColumn(name = "direcID")
    private Direccion direccion;

    //one to many hacia credito
    @JsonIgnore
    @OneToMany(mappedBy = "sucursal")
    private List<Credito> credito;


}
