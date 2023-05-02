package com.back.creditobancario.repository;

import com.back.creditobancario.model.Credito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditoRepository extends JpaRepository<Credito, Long> {
}
