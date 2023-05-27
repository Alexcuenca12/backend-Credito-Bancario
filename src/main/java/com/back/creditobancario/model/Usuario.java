package com.back.creditobancario.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuario")
public class Usuario implements Serializable, UserDetails {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuarioID")
    private Long usuario_id;

    @Column(name = "usuarioUsername", unique = true)
    private String username;

    @Column(name = "usuarioPassword")
    private String password;

    //fecha_registro
    @Column(name = "usuarioRegistro")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date fecha_registro;

    @Column(name = "usuarioPreg_uno")
    private String preguntaUno;

    @Column(name = "usuarioPreg_dos")
    private String preguntaDos;

    @Column(name = "usuarioEstado")
    private Boolean usuario_estado;

    //Relaciones

    //one to one desde persona
    @OneToOne()
    @JoinColumn(name = "persID")
    private Persona persona;

    //many to one desde rol
    @ManyToOne
    @JoinColumn(name = "rolID")
    private Rol rol;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usuario")
    @JsonIgnore
    private Set<UsuarioRol> usuarioRoles = new HashSet<>();

    //one to one hacia sucursal
    @ManyToOne()
    @JoinColumn(name = "sucursalID")
    private Sucursal sucursal;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<Authority> autoridades = new HashSet<>();
        this.usuarioRoles.forEach(usuarioRol -> {
            autoridades.add(new Authority(usuarioRol.getRol().getRol_nombre()));
        });
        return autoridades;
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
