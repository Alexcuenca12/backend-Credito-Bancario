package com.back.creditobancario.service.ServiciosImpl;

import com.back.creditobancario.repository.listaSolicitudUserRepository;
import com.back.creditobancario.views.listaSolicitudUser;
import com.back.creditobancario.service.Servicios.listaSolicitudUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class listaSolicitudServiceImpl extends GenericServiceImpl<listaSolicitudUser,Long> implements listaSolicitudUserService {

    @Autowired
    listaSolicitudUserRepository userListRepository;
    @Override
    public List<listaSolicitudUser> listarSolicitudesUsername(String username) {
        return userListRepository.listarSolicitudesUsername(username);
    }

    @Override
    public CrudRepository<listaSolicitudUser, Long> getDao() {
        return userListRepository;
    }
}
