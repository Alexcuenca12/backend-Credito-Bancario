package com.back.creditobancario.service.ServiciosImpl;
//Servicio para BienesRaices

import com.back.creditobancario.model.BienesRaices;
import com.back.creditobancario.repository.BienesRaicesRepository;
import com.back.creditobancario.service.Servicios.BienesRaicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class BienesRaicesServiceImpl extends GenericServiceImpl<BienesRaices, Long>  implements BienesRaicesService {
    @Autowired
    BienesRaicesRepository bienesRaicesRepository;
    @Override
    public CrudRepository<BienesRaices, Long> getDao() {
        return bienesRaicesRepository;
    }
}
