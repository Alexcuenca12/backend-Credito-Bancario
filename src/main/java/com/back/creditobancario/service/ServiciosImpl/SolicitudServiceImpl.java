package com.back.creditobancario.service.ServiciosImpl;
//Servicio implement para Solicitud

import com.back.creditobancario.model.Solicitud;
import com.back.creditobancario.repository.SolicitudRepository;
import com.back.creditobancario.service.Servicios.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitudServiceImpl extends GenericServiceImpl<Solicitud, Long>  implements SolicitudService {
    @Autowired
    SolicitudRepository solicitudRepository;
    @Override
    public CrudRepository<Solicitud, Long> getDao() {
        return solicitudRepository;
    }

    @Override
    public List<Solicitud> listarSolicitudesEstado() {
        return solicitudRepository.listarSolicitudesEstado();
    }

    @Override
    public List<Solicitud> listarSolicitudesUsername(String username) {
        return solicitudRepository.listarSolicitudesUsername(username);
    }

}
