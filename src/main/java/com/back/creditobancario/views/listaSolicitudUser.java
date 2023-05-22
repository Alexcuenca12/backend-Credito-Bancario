package com.back.creditobancario.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "listarsolicitudesusername")
@NoArgsConstructor
@AllArgsConstructor
public class listaSolicitudUser {
    @Id
    private Long soliid;
    private Date cred_fecha;
    private Double cred_monto;
    private String soli_estado_registro;
    private String usuario_username;

}
