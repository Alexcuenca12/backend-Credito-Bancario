package com.back.creditobancario.controller;

import com.back.creditobancario.model.Usuario;
import com.back.creditobancario.repository.UsuarioRepository;
import com.back.creditobancario.service.Servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    UsuarioRepository userRepository;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/users/list")
    public ResponseEntity<List<Usuario>> getUsuariosList() {
        return ResponseEntity.ok().body(usuarioService.findByAll());
    }

    //Metodos movil
    @GetMapping("/users/listUsuRol")
    public ResponseEntity<List<Usuario>> getUsuariosRolList(String username) {
        return ResponseEntity.ok().body(usuarioService.listarUsuarioRol(username));
    }

    //Metodos movil
    @GetMapping("/users/listImg")
    public ResponseEntity<List<Usuario>> getImgPersona(String username) {
        return ResponseEntity.ok().body(usuarioService.listarImg(username));
    }

    @GetMapping("/search/{username}")
    public Usuario obtenerUsuario(@PathVariable("username") String username) {
        return usuarioService.search(username);
    }

    @PutMapping("/delete/{usuarioId}")
    public ResponseEntity<?> eliminar(@PathVariable Long id, @RequestBody Usuario u) {
        Usuario usuario = usuarioService.findById(id);
        if (usuario == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                usuario.setUsuario_estado(false);
                return new ResponseEntity<>(usuarioService.save(usuario), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Long id, @RequestBody Usuario u) {
        Usuario usuario = usuarioService.findById(id);
        if (usuario == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                usuario.setUsername(u.getUsername());
                usuario.setPassword(u.getPassword());
                usuario.setRol(u.getRol());
                usuario.setSucursal(u.getSucursal());
                usuario.setPreguntaUno(u.getPreguntaUno());
                usuario.setPreguntaDos(u.getPreguntaDos());
                usuario.setSucursal(u.getSucursal());
                usuario.setPersona(u.getPersona());
                usuario.setUsuario_estado(u.getUsuario_estado());
                return new ResponseEntity<>(usuarioService.save(usuario), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @PutMapping("/restablecer/{username}")
    public ResponseEntity<Usuario> restableceContra(@PathVariable String username, @RequestBody Usuario u) {
        Usuario usuario = usuarioService.search(username);
        if (usuario == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                if ((usuario.getPreguntaUno().equals(u.getPreguntaUno())) || (usuario.getPreguntaDos().equals(u.getPreguntaDos()))) {
                    usuario.setUsername("usuario prueba");
                    usuario.setPassword("12345");
                    usuario.setRol(u.getRol());
                }
                return new ResponseEntity<>(usuarioService.save(usuario), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }


    @PostMapping("/signin")
    public Usuario IniciarSesion(@RequestBody Usuario usuario) throws Exception {
        // COMPROBAR SI EXISTE EL NOMBRE DE USUARIO EN NUESTRA BD..
        if (userRepository.existsByUsername(usuario.getUsername())) {
            // COMPROBAR SI CONINCIDE USUARIO Y CONTRASEÑA EN NUESTRA BD..
            if (userRepository.existsByPassword(usuario.getPassword())) {
                return usuarioService.search(usuario.getUsername());
            } else {
                throw new Exception("Error: Datos Erroneos!");
            }
        } else {
            throw new Exception("Error: Datos Erroneos!");
        }
    }

    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario create(@RequestBody Usuario usuario) throws Exception {
        // VERIFICAR SI HAY EXISTENCIA DE USUARIO EN NUESTRA BD..
        if (!userRepository.existsByUsername(usuario.getUsername())) {
            return usuarioService.save(usuario);
        } else {
            throw new Exception("Error: Usuario ya esta en la BD!");
        }
    }

    @RequestMapping(value = "login/{username}/{password}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public Usuario login(@PathVariable String username, @PathVariable String password) {
        return usuarioService.login(username, password);
    }

    @RequestMapping(value = "restablecerC/{username}/{preguntaUno}/{preguntaDos}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public Usuario restablecerContra(@PathVariable String username, @PathVariable String preguntaUno,@PathVariable String preguntaDos) {
        return usuarioService.restablecer(username, preguntaUno,preguntaDos);
    }
}

