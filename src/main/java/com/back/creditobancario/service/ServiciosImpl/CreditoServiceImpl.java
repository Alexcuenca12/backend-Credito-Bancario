package com.back.creditobancario.service.ServiciosImpl;
//Servicio para Credito

import com.back.creditobancario.model.Credito;
import com.back.creditobancario.repository.CreditoRepository;
import com.back.creditobancario.service.Servicios.CreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CreditoServiceImpl extends GenericServiceImpl<Credito, Long>  implements CreditoService {
    @Autowired
    CreditoRepository creditoRepository;
    @Override
    public CrudRepository<Credito, Long> getDao() {
        return creditoRepository;
    }
}

