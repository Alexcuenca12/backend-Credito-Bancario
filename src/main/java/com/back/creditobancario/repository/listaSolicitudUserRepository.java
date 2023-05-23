package com.back.creditobancario.repository;

import com.back.creditobancario.model.Solicitud;
import com.back.creditobancario.views.listaSolicitudUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface listaSolicitudUserRepository extends JpaRepository<listaSolicitudUser, Long> {

    @Query(value = "Select * from listarsolicitudesusername \n" +
            "where usuario_username = ?", nativeQuery = true)
    List<listaSolicitudUser> listarSolicitudesUsername(String username);

    @Query(value = "Select * from listarsolicitudesusername \n" +
            "where sucuid = ?", nativeQuery = true)
    List<listaSolicitudUser> listarSolicitudesSucursal(Long id);
}
