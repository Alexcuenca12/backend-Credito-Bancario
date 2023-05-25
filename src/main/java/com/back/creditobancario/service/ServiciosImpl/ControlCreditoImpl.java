package com.back.creditobancario.service.ServiciosImpl;

import com.back.creditobancario.model.ControlCredito;
import com.back.creditobancario.repository.ControlCreditoRepository;
import com.back.creditobancario.service.Servicios.ControlCreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ControlCreditoImpl extends GenericServiceImpl<ControlCredito,Long> implements ControlCreditoService {
     @Autowired
    ControlCreditoRepository controlCreditoRepository;
    @Override
    public CrudRepository<ControlCredito, Long> getDao() {
        return controlCreditoRepository;
    }

    @Override
    public ControlCredito findByIDSoli(Long soliid) {
        return controlCreditoRepository.findByIDSoli(soliid);
    }
}
