package com.back.creditobancario.repository;
//Repositorio para Solicitud
import com.back.creditobancario.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
}
