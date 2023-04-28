package com.back.creditobancario.service.ServiciosImpl;

import com.back.creditobancario.model.Parroquia;
import com.back.creditobancario.repository.ParroquiaRepository;
import com.back.creditobancario.service.Servicios.ParroquiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ParroquiaServiceImpl extends GenericServiceImpl<Parroquia, Long> implements ParroquiaService {
    @Autowired
    ParroquiaRepository parroquiaRepository;
    @Override
    public CrudRepository<Parroquia, Long> getDao() {
        return parroquiaRepository;
    }
}
