package com.back.creditobancario.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vehiculo")
public class Vehiculo  implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehiID")
    private Long vehi_id;

    //tipo
    @Column(name = "vehiTipo")
    private String vehi_tipo;

    //marca
    @Column(name = "vehiMarca")
    private String vehi_marca;

    //modelo
    @Column(name = "vehiModelo")
    private String vehi_modelo;

    //placa
    @Column(name = "vehiPlaca")
    private String vehi_placa;

    //valor
    @Column(name = "vehiValor")
    private Double vehi_valor;

    //prenda
    @Column(name = "vehiPrenda")
    private String vehi_prenda;

    //fecha_adquisicion
    @Column(name = "vehiFechaAdquisicion")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date vehi_fechaAdquisicion;

    //institucion_persona
    @Column(name = "vehiculoInstitucionPersona")
    private String vehi_institucionPersona;

    //estado
    @Column(name = "vehiEstado")
    private Boolean vehi_estado;


    //Relaciones

    //one to many hacia solicitante
    @OneToMany(mappedBy = "vehiculo")
    private List<Solicitud> solicitud;

}
