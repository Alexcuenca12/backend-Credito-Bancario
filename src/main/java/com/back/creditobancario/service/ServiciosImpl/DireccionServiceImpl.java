package com.back.creditobancario.service.ServiciosImpl;

import com.back.creditobancario.model.Direccion;
import com.back.creditobancario.repository.DireccionRepository;
import com.back.creditobancario.service.Servicios.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DireccionServiceImpl extends GenericServiceImpl<Direccion, Long> implements DireccionService {
    @Autowired
    DireccionRepository direccionRepository;
    @Override
    public CrudRepository<Direccion, Long> getDao() {
        return direccionRepository;
    }
}
