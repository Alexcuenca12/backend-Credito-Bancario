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

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emplID")
    private Long empl_id;

    //tipo_empleado
    @Column(name = "emplTipoEmpleado")
    private String empl_tipoEmpleado;

    //actividad_empresa
    @Column(name = "emplActividadEmpresa")
    private String empl_actividadEmpresa;

    //nombre_empresa
    @Column(name = "emplNombreEmpresa")
    private String empl_nombreEmpresa;

    //cargo_empresa
    @Column(name = "emplCargoEmpresa")
    private String empl_cargoEmpresa;

    //telefono_empresa
    @Column(name = "emplTelefonoEmpresa")
    private String empl_telefonoEmpresa;

    //referencia_empresa
    @Column(name = "emplReferenciaEmpresa")
    private String empl_referenciaEmpresa;

    //tiempo_empresa
    @Column(name = "emplTiempoEmpresa")
    private String empl_tiempoEmpresa;

    //estado
    @Column(name = "emplEstado")
    private Boolean empl_estado;


    //Relaciones

    //many to one desde direccion
    @ManyToOne
    @JoinColumn(name = "direcID")
    private Direccion direccion;

    //one to one hacia conyugue
    @JsonIgnore
    @OneToOne(mappedBy = "empleo")
    private Conyugue conyugue;

    //one to one hacia solicitante
    @JsonIgnore
    @OneToOne(mappedBy = "empleo")
    private Solicitante solicitante;

}
