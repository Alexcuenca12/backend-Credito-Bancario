package com.back.creditobancario.repository;

import com.back.creditobancario.model.Canton;
import com.back.creditobancario.model.Parroquia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParroquiaRepository extends JpaRepository<Parroquia, Long> {

    List<Parroquia> findByCanton(Canton canton);
}
