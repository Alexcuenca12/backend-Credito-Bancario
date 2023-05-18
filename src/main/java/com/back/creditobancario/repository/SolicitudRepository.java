package com.back.creditobancario.repository;
//Repositorio para Solicitud

import com.back.creditobancario.model.Solicitud;
import com.back.creditobancario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {

    @Query(value = "SELECT s.soliid, p.per_cedula,p.pers_nombres||''||p.pers_apellidos as nombres,\n" +
            "c.cred_monto,c.cred_fecha,s.soli_estado \n" +
            "FROM solicitud s \n" +
            "join persona p on s.persid=p.persid \n" +
            "join credito c on s.credid=c.credid\n", nativeQuery = true)
    List<Solicitud> listarSolicitudesEstado();

    @Query(value = "SELECT s.soliid, p.per_cedula,p.pers_nombres||''||p.pers_apellidos as nombres,\n" +
            "c.cred_monto,c.cred_fecha,s.soli_estado \n" +
            "FROM solicitud s \n" +
            "join persona p on s.persid=p.persid\n" +
            "join usuario u on p.persid=u.persid\n" +
            "join credito c on s.credid=c.credid\n" +
            "where u.usuario_username='' ?", nativeQuery = true)
    List<Solicitud> listarSolicitudesUsername(String username);


}
