package com.back.creditobancario.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFormat;
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
@Table(name = "deudas")
public class Deudas implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deudID")
    private Long deu_id;

    //fecha_corte
    @Column(name = "deudFechaCorte")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date deud_fechaCorte;

    //institucion
    @Column(name = "deudInstitucion")
    private String deud_institucion;

    //valor
    @Column(name = "deudValor")
    private Double deud_valor;

    //otorgado
    @Column(name = "deudOtorgado")
    private String deud_otorgado;

    //destino
    @Column(name = "deudDestino")
    private String deud_destino;

    //saldo
    @Column(name = "deudSaldo")
    private Double deud_saldo;

    //estado
    @Column(name = "deudEstado")
    private Boolean deud_estado;

    //Relaciones

    //one to meny hacia Soliciante
    @OneToMany(mappedBy = "deudas")
    @JsonIgnore
    private List<Solicitud> solicitud;

}
