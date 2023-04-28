package com.back.creditobancario.repository;

import com.back.creditobancario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository <Usuario, Long> {
    public Usuario findByUsername(String username);

    Boolean existsByUsername(String username);
    Usuario findByusernameAndPassword(String username, String password);

    // Metodos Query
    @Query(value = "SELECT * FROM usuario WHERE username = ?", nativeQuery = true)
    List<Usuario> buscarUsername(String username);

    public boolean existsByPassword(String password);

    @Query(value = "Select * from usuario  where enabled = 1", nativeQuery = true)
    List<Usuario>listarUsuario();
}
