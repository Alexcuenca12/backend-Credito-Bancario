package com.back.creditobancario.service.ServiciosImpl;
//Servicio para Gastos
import com.back.creditobancario.model.Gastos;
import com.back.creditobancario.repository.GastosRepository;
import com.back.creditobancario.service.Servicios.GastosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class GastosServiceImpl extends GenericServiceImpl<Gastos, Long>  implements GastosService {
    @Autowired
    GastosRepository gastosRepository;
    @Override
    public CrudRepository<Gastos, Long> getDao() {
        return gastosRepository;
    }
}

