package com.back.creditobancario.service.ServiciosImpl;

import com.back.creditobancario.model.Usuario;
import com.back.creditobancario.model.UsuarioRol;
import com.back.creditobancario.repository.RolRepository;
import com.back.creditobancario.repository.UsuarioRepository;
import com.back.creditobancario.service.Servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UsuarioServiceImp extends GenericServiceImpl<Usuario, Long> implements UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    RolRepository rolRepository;

    @Override
    public Usuario search(String username) {
        return usuarioRepository.findUsuarioByUsername(username);
    }

    @Override
    public Usuario login(String username, String password) {
        return usuarioRepository.findByusernameAndPassword(username, password);
    }

    @Override
    public Usuario restablecer(String username, String pregunta_uno, String pregunta_dos) {
        return usuarioRepository.findByusernameAndPreguntaUnoAndPreguntaDos(username,pregunta_uno,pregunta_dos);
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
        Usuario usuarioLocal = usuarioRepository.findUsuarioByUsername(usuario.getUsername());
        if(usuarioLocal != null){
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya esta presente");
        }
        else{
            for(UsuarioRol usuarioRol:usuarioRoles){
                rolRepository.save(usuarioRol.getRol());
            }
            usuario.getUsuarioRoles().addAll(usuarioRoles);
            usuarioLocal = usuarioRepository.save(usuario);
        }
        return usuarioLocal;
    }

    @Override
    public List<Usuario> listarUsuarioRol(String username) {
        return usuarioRepository.listarUsuarioRol(username);
    }

    @Override
    public List<Usuario> listarImg(String username) {
        return usuarioRepository.listarImg(username);
    }

    @Override
    public CrudRepository<Usuario, Long> getDao() {
        return usuarioRepository;
    }
}
