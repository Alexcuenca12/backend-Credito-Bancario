package com.back.creditobancario.service.Servicios;

import com.back.creditobancario.model.Usuario;
import com.back.creditobancario.model.UsuarioRol;

import java.util.List;
import java.util.Set;

public interface UsuarioService extends IGenericService<Usuario, Long> {
    public Usuario save(Usuario usuario);

    public Usuario search(String username);

    Usuario login(String username, String password);

    Usuario restablecer(String username, String pregunta_uno, String pregunta_dos);

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public void delete(Long usuario_id);

    List<Usuario> listarUsuarioRol(String username);

    List<Usuario> listarImg(String username);


}
