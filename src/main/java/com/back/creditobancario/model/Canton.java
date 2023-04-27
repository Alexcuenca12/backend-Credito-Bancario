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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cantonID")
    private Long canton_id;

    @Column(name = "cantonCod")
    private String canton_codigo;

    @Column(name = "cantonNombre")
    private String canton_nombre;

    @ManyToOne
    @JoinColumn(name = "provID")
    private Provincia provincia;


    @JsonIgnore
    @OneToMany(mappedBy = "canton")
    private List<Parroquia> parroquia;
}
