package com.back.creditobancario.repository;

import com.back.creditobancario.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SucursalRepository extends JpaRepository<Sucursal, Long> {
    @Query(value = "SELECT * from sucursal where suc_nombre =?",nativeQuery = true)
    Sucursal findByNombre(String nombre);
}
