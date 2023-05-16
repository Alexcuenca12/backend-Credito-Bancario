package com.back.creditobancario.service.Servicios;
//Servicio para Solicitud
import com.back.creditobancario.model.Solicitud;

import java.util.List;

public interface SolicitudService extends IGenericService<Solicitud, Long>{
    public List<Solicitud>listarSolicitudesEstado();
    public  List<Solicitud>listarSolicitudesUsername(String username);
}
