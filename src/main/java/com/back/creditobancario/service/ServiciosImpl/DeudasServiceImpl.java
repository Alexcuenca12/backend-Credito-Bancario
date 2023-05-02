package com.back.creditobancario.service.ServiciosImpl;
//Servicio para Deudas

import com.back.creditobancario.model.Deudas;
import com.back.creditobancario.repository.DeudasRepository;
import com.back.creditobancario.service.Servicios.DeudasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DeudasServiceImpl extends GenericServiceImpl<Deudas, Long>  implements DeudasService {
    @Autowired
    DeudasRepository deudasRepository;
    @Override
    public CrudRepository<Deudas, Long> getDao() {
        return deudasRepository;
    }
}
