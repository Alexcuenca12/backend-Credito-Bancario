package com.back.creditobancario.service.ServiciosImpl;
//Servicio para TablaBuro
import com.back.creditobancario.model.TablaBuro;
import com.back.creditobancario.repository.TablaBuroRepository;
import com.back.creditobancario.service.Servicios.TablaBuroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class TablaBuroServiceImpl extends GenericServiceImpl<TablaBuro, Long>  implements TablaBuroService {
    @Autowired
    TablaBuroRepository tablaBuroRepository;
    @Override
    public CrudRepository<TablaBuro, Long> getDao() {
        return tablaBuroRepository;
    }
}
