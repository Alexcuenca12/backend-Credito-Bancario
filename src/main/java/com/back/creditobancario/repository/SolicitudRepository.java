package com.back.creditobancario.repository;
//Repositorio para Solicitud

import com.back.creditobancario.model.Solicitud;
import com.back.creditobancario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {

    @Query(value = "SELECT s.soli_estado, p.pers_nombres || ' ' || p.pers_apellidos AS nombre_completo , c.cred_fecha, c.cred_monto \n" +
            "FROM solicitud s \n" +
            "JOIN persona p ON s.persid = p.persid\n" +
            "JOIN credito c ON s.credid = c.credid", nativeQuery = true)
    List<Solicitud> listarSolicitudesEstado();
}
