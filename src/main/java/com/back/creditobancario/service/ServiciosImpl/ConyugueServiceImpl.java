package com.back.creditobancario.service.ServiciosImpl;

import com.back.creditobancario.model.Conyugue;
import com.back.creditobancario.repository.ConyugueRepository;
import com.back.creditobancario.service.Servicios.ConyugueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ConyugueServiceImpl extends GenericServiceImpl<Conyugue, Long> implements ConyugueService {

    @Autowired
    ConyugueRepository conyugueRepository;

    @Override
    public CrudRepository<Conyugue, Long> getDao() {
        return null;
    }
}
