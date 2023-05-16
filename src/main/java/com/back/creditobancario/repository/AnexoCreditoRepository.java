package com.back.creditobancario.repository;
//Repository para AnexoCredito

import com.back.creditobancario.model.AnexoCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnexoCreditoRepository extends JpaRepository<AnexoCredito, Long> {

    @Query(value = "SELECT a.* FROM anexo_credito a join credito c on a.credid = c.credid\n" +
            "join solicitud s on s.credid=c.credid\n" +
            "where s.soliid = ?", nativeQuery = true)
    List<AnexoCredito> listarDocumentos(Long id);
}
