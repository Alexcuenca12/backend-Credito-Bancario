package com.back.creditobancario.service.ServiciosImpl;

import com.back.creditobancario.model.Persona;
import com.back.creditobancario.repository.PersonaRepository;
import com.back.creditobancario.service.Servicios.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona,Long>implements PersonaService {
    @Autowired
    PersonaRepository personaRepository;
    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaRepository;
    }
}
