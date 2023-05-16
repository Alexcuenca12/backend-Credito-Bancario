package com.back.creditobancario.service.Servicios;
//servcio para AnexoCredito
import com.back.creditobancario.model.AnexoCredito;

import java.util.List;

public interface AnexoCreditoService  extends IGenericService<AnexoCredito, Long>{
    List<AnexoCredito>listarDocumentos(Long id);
}
