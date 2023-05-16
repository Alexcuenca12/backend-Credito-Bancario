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
@Table(name = "canton")
public class Canton implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cantID")
    private Long cant_id;

    //codigo
    @Column(name = "cantCod")
    private String cant_codigo;

    //nombre
    @Column(name = "cantNombre")
    private String cant_nombre;

    //Relaciones

    //one to many hacia provincia
    @ManyToOne
    @JoinColumn(name = "provId")
    private Provincia provincia;

    //many to one desde parroquia
    @JsonIgnore
    @OneToMany(mappedBy = "canton")
    private List<Parroquia>parroquia;
}
