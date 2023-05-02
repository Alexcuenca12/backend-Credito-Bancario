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
@Table(name = "empleo")
public class Empleo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empleoID")
    private Long empleo_id;

    @Column(name = "empleoTipoEmp")
    private String empleo_tipoEmpleado;

    @Column(name = "empleoActEmpresa")
    private String empleo_actEmpresa;

    @Column(name = "empleoNomEmpresa")
    private String empleo_nomEmpresa;

    @Column(name = "empleoCargoEmpresa")
    private String empleo_cargoEmpresa;

    @Column(name = "empleoTlfnEmpresa")
    private String empleo_tlfnEmpresa;

    @Column(name = "empleoRefEmpresa")
    private String empleo_refEmpresa;

    @Column(name = "empleoTiempoEmpresa")
    private String empleo_tiempoEmpresa;

    @Column(name = "empleoEstado")
    private Boolean empleo_estado;

    @ManyToOne
    @JoinColumn(name = "direcID")
    private Direccion direccion;

    @JsonIgnore
    @OneToOne(mappedBy = "empleo")
    private Conyugue conyugue;

}
