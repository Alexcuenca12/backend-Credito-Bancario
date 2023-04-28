package com.back.creditobancario.service.ServiciosImpl;

import com.back.creditobancario.model.Empleo;
import com.back.creditobancario.repository.EmpleoRepository;
import com.back.creditobancario.service.Servicios.EmpleoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpleoServiceImpl extends GenericServiceImpl<Empleo,Long> implements EmpleoService {
    @Autowired
    EmpleoRepository empleoRepository;
    @Override
    public CrudRepository<Empleo, Long> getDao() {
        return empleoRepository;
    }
}
