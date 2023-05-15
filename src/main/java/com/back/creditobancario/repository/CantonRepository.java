package com.back.creditobancario.repository;

import com.back.creditobancario.model.Canton;
import com.back.creditobancario.model.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CantonRepository extends JpaRepository<Canton, Long> {
    List<Canton> findByProvincia(Provincia provincia);
}
