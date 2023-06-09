package com.back.creditobancario.service.ServiciosImpl;
//Servicio para ReferenciasBancaria

import com.back.creditobancario.model.ReferenciasBancarias;
import com.back.creditobancario.repository.ReferenciasBancariasRepository;
import com.back.creditobancario.service.Servicios.ReferenciasBancariasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ReferenciasBancariasServiceImpl extends GenericServiceImpl<ReferenciasBancarias, Long>  implements ReferenciasBancariasService {
    @Autowired
    ReferenciasBancariasRepository referenciasBancariasRepository;
    @Override
    public CrudRepository<ReferenciasBancarias, Long> getDao() {
        return referenciasBancariasRepository;
    }
}
