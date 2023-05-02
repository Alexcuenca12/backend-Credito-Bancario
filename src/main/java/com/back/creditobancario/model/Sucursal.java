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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sucursalID")
    private Long sucursal_id;

    @Column(name = "sucursalEstado")
    private Boolean sucursal_estado;
    @OneToOne()
    @JoinColumn(name = "usuarioID")
    private Usuario usuario;

    @OneToOne()
    @JoinColumn(name = "direcID")
    private Direccion direccion;

    @JsonIgnore
    @OneToMany(mappedBy = "credito")
    private List<Credito> credito;



}
