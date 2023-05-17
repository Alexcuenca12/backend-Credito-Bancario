package com.back.creditobancario.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tarjetascredito")
public class TarjetasCredito {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tarCredID")
    private Long tarCred_id;

    //banco
    @Column(name = "tarCredBanco")
    private String tarCred_banco;

    //numero
    @Column(name = "tarCredNumero")
    private String tarCred_numero;

    //cauducidad
    @Column(name = "tarCredCaducidad")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date tarCred_caducidad;

    //cupo
    @Column(name = "tarCredCupo")
    private Double tarCred_cupo;

    //utilizado
    @Column(name = "tarCredUtilizado")
    private String tarCred_utilizado;

    //cuota
    @Column(name = "tarCredCuota")
    private String tarCred_cuota;

    //estado
    @Column(name = "tarCredEstado")
    private Boolean tarCred_estado;


    //Relaciones
    @JsonIgnore
    @OneToMany(mappedBy = "tarjetasCredito")
    private List<Solicitud> solicitudes;

}
