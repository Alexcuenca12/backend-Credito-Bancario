package com.back.creditobancario.repository;
//Repository para AnexoCredito
import com.back.creditobancario.model.AnexoCredito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnexoCreditoRepository extends JpaRepository<AnexoCredito, Long> {
}
