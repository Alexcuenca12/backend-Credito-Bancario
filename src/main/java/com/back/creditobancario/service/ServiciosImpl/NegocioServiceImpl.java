package com.back.creditobancario.service.ServiciosImpl;

import com.back.creditobancario.model.Negocio;
import com.back.creditobancario.repository.NegocioRepository;
import com.back.creditobancario.service.Servicios.NegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class NegocioServiceImpl extends GenericServiceImpl<Negocio,Long>implements NegocioService {
    @Autowired
    NegocioRepository negocioRepository;
    @Override
    public CrudRepository<Negocio, Long> getDao() {
        return negocioRepository;
    }
}
