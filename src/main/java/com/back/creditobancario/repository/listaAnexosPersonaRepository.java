package com.back.creditobancario.repository;


import com.back.creditobancario.views.listarAnexosPersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface listaAnexosPersonaRepository extends JpaRepository<listarAnexosPersona, Long> {

    @Query(value = "Select * from listaranexospersona \n" +
            "where persid = ?", nativeQuery = true)
    List<listarAnexosPersona> listarAnexosPersona(Long id);
}
