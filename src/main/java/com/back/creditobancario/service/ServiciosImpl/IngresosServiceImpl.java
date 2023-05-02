package com.back.creditobancario.service.ServiciosImpl;
//Servicio para Ingresos

import com.back.creditobancario.model.Ingresos;
import com.back.creditobancario.repository.IngresosRepository;
import com.back.creditobancario.service.Servicios.IngresosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class IngresosServiceImpl extends GenericServiceImpl<Ingresos, Long>  implements IngresosService {
    @Autowired
    IngresosRepository ingresosRepository;
    @Override
    public CrudRepository<Ingresos, Long> getDao() {
        return ingresosRepository;
    }
}

