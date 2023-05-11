package com.back.creditobancario.service.Servicios;

import com.back.creditobancario.model.Usuario;

import java.util.List;

public interface UsuarioService extends IGenericService<Usuario, Long> {
    public Usuario save(Usuario usuario);

    public Usuario search(String username);

    Usuario login(String username, String password);

    public void delete(Long usuario_id);

    List<Usuario> listarUsuarioRol(String username);

    List<Usuario> listarImg(String username);

}
