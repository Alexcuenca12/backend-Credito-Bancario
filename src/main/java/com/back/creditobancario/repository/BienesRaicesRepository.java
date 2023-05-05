package com.back.creditobancario.repository;
//Repository para BienesRaices
import com.back.creditobancario.model.BienesRaices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BienesRaicesRepository  extends JpaRepository<BienesRaices, Long> {
}
