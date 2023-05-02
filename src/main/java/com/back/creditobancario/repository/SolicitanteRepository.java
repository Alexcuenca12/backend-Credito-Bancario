package com.back.creditobancario.repository;

import com.back.creditobancario.model.Solicitante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitanteRepository extends JpaRepository<Solicitante, Long> {
}
