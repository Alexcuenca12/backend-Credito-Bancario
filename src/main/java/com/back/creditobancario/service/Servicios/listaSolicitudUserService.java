package com.back.creditobancario.service.Servicios;

import com.back.creditobancario.views.listaSolicitudUser;

import java.util.List;

public interface listaSolicitudUserService extends IGenericService<listaSolicitudUser, Long> {

    public List<listaSolicitudUser> listarSolicitudesUsername(String username);

    public List<listaSolicitudUser> listarSolicitudesSucursal(Long id);

}
