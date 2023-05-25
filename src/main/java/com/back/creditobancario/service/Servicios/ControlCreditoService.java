package com.back.creditobancario.service.Servicios;

import com.back.creditobancario.model.ControlCredito;
import com.back.creditobancario.model.Solicitud;

import java.util.List;

public interface ControlCreditoService extends IGenericService <ControlCredito, Long>  {

    ControlCredito findByIDSoli (Long soliid);
}
