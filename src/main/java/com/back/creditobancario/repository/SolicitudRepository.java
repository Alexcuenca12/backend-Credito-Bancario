package com.back.creditobancario.repository;
//Repositorio para Solicitud

import com.back.creditobancario.model.Solicitud;
import com.back.creditobancario.views.listaSolicitudUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {

    @Query(value = "SELECT * FROM solicitud s \n" +
            "join persona p on s.pesid=p.persid\n" +
            "join usuario u on p.persid=u.persid\n" +
            "join credito c on s.credid=c.credid", nativeQuery = true)
    List<Solicitud> listarSolicitudesEstado();

    @Query(value = "SELECT * FROM solicitud s\n" +
            "    join persona p on s.persid=p.persid\n" +
            "    join usuario u on p.persid=u.persid\n" +
            "    join credito c on s.credid=c.credid\n" +
            "    join sucursal su on c.sucursalid=su.sucuid\n" +
            " WHERE su.sucu_nombre = ?", nativeQuery = true)
    List<Solicitud> ListarSolicitudesSucursal(String sucursal);


}
