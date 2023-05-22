package com.back.creditobancario.service.Servicios;

import com.back.creditobancario.views.listarAnexosPersona;

import java.util.List;

public interface listaAnexoPersonaService extends IGenericService<listarAnexosPersona, Long> {
    public List<listarAnexosPersona> listarAnexosPersona(Long id);

}
