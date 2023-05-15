package com.back.creditobancario.service.ServiciosImpl;

import com.back.creditobancario.model.Sucursal;
import com.back.creditobancario.repository.SucursalRepository;
import com.back.creditobancario.service.Servicios.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class SucursalServiceImpl extends GenericServiceImpl<Sucursal, Long> implements SucursalService {
    @Autowired
    SucursalRepository sucursalRepository;
    @Override
    public CrudRepository<Sucursal, Long> getDao() {
        return sucursalRepository;
    }

    @Override
    public Sucursal findByNombre(String nombre) {
        return sucursalRepository.findByNombre(nombre);
    }
}
