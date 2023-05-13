package com.back.creditobancario.repository;

import com.back.creditobancario.model.Direccion;
import com.back.creditobancario.model.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Long> {

}
