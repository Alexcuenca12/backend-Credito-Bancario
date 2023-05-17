package com.back.creditobancario.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "credito")
public class Credito implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credID")
    private Long cred_id;

    //fecha
    @Column(name = "credFecha")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date cred_fecha;

    //monto
    @Column(name = "credMonto")
    private Double cred_monto;

    //plazo
    @Column(name = "credPlazo")
    private String cred_plazo;

    //numero
    @Column(name = "credNumero")
    private int cred_numero;

    //estado
    @Column(name = "credEstado")
    private Boolean cred_estado;


    //Relaciones

    //many to one desde sucursal
    @ManyToOne
    @JoinColumn(name = "sucursalID")
    private Sucursal sucursal;

    //many to one desde DestinoCredito
    @ManyToOne
    @JoinColumn(name = "destCredID")
    private DestinoCredito destino_credito;

    //one to many hacia Solicitante
    @JsonIgnore
    @OneToMany(mappedBy = "credito")
    private List<Solicitud> solicitud;

    //one to one hacia AnexoCredito
    @OneToOne(mappedBy = "credito")
    @JsonIgnore
    private AnexoCredito anexo_credito;

}
