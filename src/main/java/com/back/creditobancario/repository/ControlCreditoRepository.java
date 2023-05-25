package com.back.creditobancario.repository;

import com.back.creditobancario.model.ControlCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ControlCreditoRepository extends JpaRepository<ControlCredito,Long> {

    @Query(value = "SELECT * from control_credito where soliid = ?",nativeQuery = true)
    ControlCredito findByIDSoli (Long soliid);
}
