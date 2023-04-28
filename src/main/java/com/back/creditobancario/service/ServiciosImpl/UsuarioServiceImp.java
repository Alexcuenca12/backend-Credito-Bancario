package com.back.creditobancario.service.ServiciosImpl;

import com.back.creditobancario.model.Usuario;
import com.back.creditobancario.repository.UsuarioRepository;
import com.back.creditobancario.service.Servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp extends GenericServiceImpl<Usuario, Long> implements UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario search(String username) {
        return usuarioRepository.findByUsername(username);
    }

    @Override
    public Usuario login(String username, String password) {
        return usuarioRepository.findByusernameAndPassword(username, password);
    }

    @Override
    public CrudRepository<Usuario, Long> getDao() {
        return usuarioRepository;
    }
}
