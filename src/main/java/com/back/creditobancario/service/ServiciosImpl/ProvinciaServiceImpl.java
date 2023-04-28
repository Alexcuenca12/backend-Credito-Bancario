package com.back.creditobancario.service.ServiciosImpl;

import com.back.creditobancario.model.Provincia;
import com.back.creditobancario.repository.ProvinciaRepository;
import com.back.creditobancario.service.Servicios.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaServiceImpl extends GenericServiceImpl<Provincia, Long> implements ProvinciaService {

    @Autowired
    ProvinciaRepository provinciaRepository;

    @Override
    public CrudRepository<Provincia, Long> getDao() {
        return provinciaRepository;
    }
}
