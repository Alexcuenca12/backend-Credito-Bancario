package com.back.creditobancario.service.ServiciosImpl;

import com.back.creditobancario.model.Canton;
import com.back.creditobancario.repository.CantonRepository;
import com.back.creditobancario.service.Servicios.CantonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CantonServiceImpl extends GenericServiceImpl<Canton, Long> implements CantonService {
    @Autowired
    CantonRepository cantonRepository;
    @Override
    public CrudRepository<Canton, Long> getDao() {
        return cantonRepository;
    }
}
