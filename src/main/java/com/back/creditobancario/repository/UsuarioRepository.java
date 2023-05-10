package com.back.creditobancario.repository;

import com.back.creditobancario.model.Usuario;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    public Usuario findByUsername(String username);

    Boolean existsByUsername(String username);

    Usuario findByusernameAndPassword(String username, String password);

    // Metodos Query
    @Query(value = "SELECT * FROM usuario WHERE username = ?", nativeQuery = true)
    List<Usuario> buscarUsername(String username);

    public boolean existsByPassword(String password);

    @Query(value = "Select * from usuario  where enabled = 1", nativeQuery = true)
    List<Usuario> listarUsuario();

    @Query(value = "select r.rol_nombre, p.pers_correo from rol r join usuario u on u.rolid = r.rolid " +
            "join persona p on p.persid= u.perid where u.usuario_username =?", nativeQuery = true)
    List<Usuario> listarUsuarioRol(String username);

    @Query(value = "select p.pers_nombres, p.pers_foto from persona p " +
            "join usuario u on p.persid= u.perid where u.usuario_username= ?", nativeQuery = true)
    List<Usuario> listarImg(String username);

}
