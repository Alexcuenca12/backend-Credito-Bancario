package com.back.creditobancario.service.ServiciosImpl;

import com.back.creditobancario.model.Rol;
import com.back.creditobancario.repository.RolRepository;
import com.back.creditobancario.service.Servicios.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class RolServiceImp extends GenericServiceImpl<Rol, Long> implements RolService {
    @Autowired
    RolRepository rolRepository;


    @Override
    public CrudRepository<Rol, Long> getDao() {
        return rolRepository;
    }
}
