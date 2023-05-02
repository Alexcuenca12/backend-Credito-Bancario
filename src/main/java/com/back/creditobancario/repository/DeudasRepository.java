package com.back.creditobancario.repository;

import com.back.creditobancario.model.Deudas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeudasRepository extends JpaRepository<Deudas, Long> {
}
