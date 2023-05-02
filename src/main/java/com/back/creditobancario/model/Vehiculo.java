package com.back.creditobancario.model;

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
@Table(name = "vehiculo")
public class Vehiculo  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehiculoID")
    private Long vehiculo_id;

    @Column(name = "vehiculoTipo")
    private String tipo;

    @Column(name = "vehiculoMarca")
    private String marca;

    @Column(name = "vehiculoModelo")
    private String modelo;

    @Column(name = "vehiculoPlaca")
    private String placa;

    @Column(name = "vehiculoValor")
    private String valor;

    @Column(name = "vehiculoPrenda")
    private String prenda;

    @Column(name = "vehiculoFechaAdquisicion")
    private String fecha_adquisicion;

    @Column(name = "vehiculoInstitucionPersona")
    private String institucion_persona;




}
