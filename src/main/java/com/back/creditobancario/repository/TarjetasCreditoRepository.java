package com.back.creditobancario.repository;

import com.back.creditobancario.model.TarjetasCredito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarjetasCreditoRepository extends JpaRepository<TarjetasCredito, Long> {
}
