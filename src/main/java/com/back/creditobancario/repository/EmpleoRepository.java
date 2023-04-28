package com.back.creditobancario.repository;

import com.back.creditobancario.model.Empleo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleoRepository extends JpaRepository<Empleo, Long> {
}
