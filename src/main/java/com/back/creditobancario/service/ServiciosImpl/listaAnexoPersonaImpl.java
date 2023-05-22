package com.back.creditobancario.service.ServiciosImpl;

import com.back.creditobancario.repository.listaAnexosPersonaRepository;
import com.back.creditobancario.repository.listaSolicitudUserRepository;
import com.back.creditobancario.service.Servicios.listaAnexoPersonaService;
import com.back.creditobancario.service.Servicios.listaSolicitudUserService;
import com.back.creditobancario.views.listaSolicitudUser;
import com.back.creditobancario.views.listarAnexosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class listaAnexoPersonaImpl extends GenericServiceImpl<listarAnexosPersona,Long> implements listaAnexoPersonaService {

    @Autowired
    listaAnexosPersonaRepository userListRepository;

    @Override
    public List<listarAnexosPersona> listarAnexosPersona(Long id) {
        return userListRepository.listarAnexosPersona(id);
    }

    @Override
    public CrudRepository<listarAnexosPersona, Long> getDao() {
        return userListRepository;
    }
}
