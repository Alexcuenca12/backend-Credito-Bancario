package com.back.creditobancario.repository;

import com.back.creditobancario.model.Negocio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NegocioRepository extends JpaRepository<Negocio, Long> {
}
