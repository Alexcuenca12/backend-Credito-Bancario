package com.back.creditobancario.service.ServiciosImpl;
//Servicio para Buro

import com.back.creditobancario.model.Buro;
import com.back.creditobancario.repository.BuroRepository;
import com.back.creditobancario.service.Servicios.BuroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class BuroServiceImpl extends GenericServiceImpl<Buro, Long>  implements BuroService {
    @Autowired
    BuroRepository buroRepository;
    @Override
    public CrudRepository<Buro, Long> getDao() {
        return buroRepository;
    }
}
