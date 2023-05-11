package com.back.creditobancario.repository;

import com.back.creditobancario.model.Direccion;
import com.back.creditobancario.model.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Long> {

    Optional<Direccion> findByDireCalleAndDireNumeroAndDireInterseccionAndDireSectorAndProvincia(String direCalle, String direNumero, String direInterseccion, String direSector,  Provincia provincia);

    Optional<Direccion> findByDireCalleAndDireNumeroAndDireInterseccionAndDireSectorAndProvinciaAndEmpleoIsNull(String calle, String numero, String interseccion, String sector, Provincia provincia);

    Optional<Direccion> findByDireCalleAndDireNumeroAndDireInterseccionAndDireSectorAndProvinciaAndNegocioIsNull(String calle, String numero, String interseccion, String sector, Provincia provincia);

}
