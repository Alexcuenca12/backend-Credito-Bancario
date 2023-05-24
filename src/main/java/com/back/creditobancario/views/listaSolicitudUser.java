package com.back.creditobancario.views;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "listarsolicitudesusername")
@NoArgsConstructor
@AllArgsConstructor
public class listaSolicitudUser {
    @Id
    private Long soliid;
    private String Nombres;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date cred_fecha;
    private Double cred_monto;
    private String soli_estado_registro;
    private String usuario_username;
    private Long sucuid;

}
