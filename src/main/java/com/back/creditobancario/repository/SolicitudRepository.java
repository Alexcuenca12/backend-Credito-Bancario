package com.back.creditobancario.repository;
//Repositorio para Solicitud

import com.back.creditobancario.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {

    @Query(value = "SELECT s.soliid, p.per_cedula,p.pers_nombres||''||p.pers_apellidos as nombres, " +
            "c.cred_monto,c.cred_fecha,s.soli_estado FROM solicitud s \n" +
            "join persona p on s.persid=p.persid\n" +
            "join usuario u on p.persid=u.persid\n" +
            "join credito c on s.credid=c.credid", nativeQuery = true)
    List<Solicitud> listarSolicitudesEstado();

    @Query(value = "SELECT s.soliid, p.per_cedula as Cedula, p.pers_nombres as Nombres, p.pers_apellidos as Apellidos, c.cred_monto as Credito,c.cred_fecha as Fecha, s.soli_estado as Activo\n" +
            "FROM solicitud s\n" +
            "    join persona p on s.persid=p.persid\n" +
            "    join usuario u on p.persid=u.persid\n" +
            "    join credito c on s.credid=c.credid\n" +
            " WHERE u.usuario_username=?", nativeQuery = true)
    List<Solicitud> listarSolicitudesUsername(String username);

    @Query(value = "SELECT s.soliid, su.sucu_nombre as Sucursal, p.per_cedula as Cedula, p.pers_nombres as Nombres, p.pers_apellidos as Apellidos,\n" +
            "       c.cred_monto as Credito,c.cred_fecha as Fecha, s.soli_estado as Activo\n" +
            "FROM solicitud s\n" +
            "    join persona p on s.persid=p.persid\n" +
            "    join usuario u on p.persid=u.persid\n" +
            "    join credito c on s.credid=c.credid\n" +
            "    join sucursal su on c.sucursalid=su.sucuid\n" +
            " WHERE su.sucu_nombre = ?", nativeQuery = true)
    List<Solicitud> ListarSolicitudesSucursal(String sucursal);


}
