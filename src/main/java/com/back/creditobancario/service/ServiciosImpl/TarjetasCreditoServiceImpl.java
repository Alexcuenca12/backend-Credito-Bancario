package com.back.creditobancario.service.ServiciosImpl;
//Servicio para TarjetasCredito

import com.back.creditobancario.model.TarjetasCredito;
import com.back.creditobancario.repository.TarjetasCreditoRepository;
import com.back.creditobancario.service.Servicios.TarjetasCreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class TarjetasCreditoServiceImpl extends GenericServiceImpl<TarjetasCredito, Long>  implements TarjetasCreditoService {
    @Autowired
    TarjetasCreditoRepository tarjetasCreditoRepository;
    @Override
    public CrudRepository<TarjetasCredito, Long> getDao() {
        return tarjetasCreditoRepository;
    }
}
