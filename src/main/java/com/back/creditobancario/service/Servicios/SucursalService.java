package com.back.creditobancario.service.Servicios;

import com.back.creditobancario.model.Sucursal;

public interface SucursalService extends IGenericService<Sucursal, Long> {
    public Sucursal findByNombre(String nombre);
}
