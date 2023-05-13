package com.back.creditobancario.repository;

import com.back.creditobancario.model.Persona;
import com.back.creditobancario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    @Query(value = "SELECT * from persona where per_cedula =?",nativeQuery = true)
    Persona findByCedula(String cedula);

}
