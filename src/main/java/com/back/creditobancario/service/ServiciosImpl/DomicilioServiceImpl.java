package com.back.creditobancario.service.ServiciosImpl;

import com.back.creditobancario.model.Domicilio;
import com.back.creditobancario.repository.DomicilioRepository;
import com.back.creditobancario.service.Servicios.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends GenericServiceImpl<Domicilio, Long> implements DomicilioService {
    @Autowired
    DomicilioRepository domicilioRepository;
    @Override
    public CrudRepository<Domicilio, Long> getDao() {
        return domicilioRepository;
    }
}
