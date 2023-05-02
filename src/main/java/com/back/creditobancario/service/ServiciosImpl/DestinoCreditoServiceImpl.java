package com.back.creditobancario.service.ServiciosImpl;
//Servicio para DestinoCredito

import com.back.creditobancario.model.DestinoCredito;
import com.back.creditobancario.repository.DestinoCreditoRepository;
import com.back.creditobancario.service.Servicios.DestinoCreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DestinoCreditoServiceImpl extends GenericServiceImpl<DestinoCredito, Long>  implements DestinoCreditoService {
    @Autowired
    DestinoCreditoRepository destinoCreditoRepository;
    @Override
    public CrudRepository<DestinoCredito, Long> getDao() {
        return destinoCreditoRepository;
    }
}

