package com.back.creditobancario.service.ServiciosImpl;
//Servicio para Vehiculo

import com.back.creditobancario.model.Vehiculo;
import com.back.creditobancario.repository.VehiculoRepository;
import com.back.creditobancario.service.Servicios.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class VehiculoServiceImpl extends GenericServiceImpl<Vehiculo, Long>  implements VehiculoService {
    @Autowired
    VehiculoRepository vehiculoRepository;
    @Override
    public CrudRepository<Vehiculo, Long> getDao() {
        return vehiculoRepository;
    }
}
