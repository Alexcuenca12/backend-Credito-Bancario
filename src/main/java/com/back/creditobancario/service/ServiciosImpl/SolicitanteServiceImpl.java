package com.back.creditobancario.service.ServiciosImpl;
//Servicio implement para Solicitante

import com.back.creditobancario.model.Solicitante;
import com.back.creditobancario.repository.SolicitanteRepository;
import com.back.creditobancario.service.Servicios.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class SolicitanteServiceImpl extends GenericServiceImpl<Solicitante, Long>  implements SolicitanteService{
    @Autowired
    SolicitanteRepository solicitanteRepository;
    @Override
    public CrudRepository<Solicitante, Long> getDao() {
        return solicitanteRepository;
    }
}
