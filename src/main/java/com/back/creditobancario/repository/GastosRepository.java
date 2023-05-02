package com.back.creditobancario.repository;

import com.back.creditobancario.model.Gastos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GastosRepository extends JpaRepository<Gastos, Long> {
}
