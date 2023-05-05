package com.back.creditobancario.service.ServiciosImpl;

//Servicio implement para AnexoCredito

import com.back.creditobancario.model.AnexoCredito;
import com.back.creditobancario.repository.AnexoCreditoRepository;
import com.back.creditobancario.service.Servicios.AnexoCreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class AnexoCreditoServiceImpl extends GenericServiceImpl<AnexoCredito, Long>  implements AnexoCreditoService {
    @Autowired
    AnexoCreditoRepository anexoCreditoRepository;
    @Override
    public CrudRepository<AnexoCredito, Long> getDao() {
        return anexoCreditoRepository;
    }
}
