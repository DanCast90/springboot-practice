package com.springpractice.daniel.controllers;

import com.springpractice.daniel.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "getU/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario=new Usuario();
        usuario.setId(id);
        usuario.setNombre("daniel");
        usuario.setApellido("de la rosa");
        usuario.setEmail("correo@correo");
        usuario.setTelefono("telefono");
        return usuario;
    }

    @RequestMapping(value = "getUs")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios=new ArrayList<>();
        Usuario usuario=new Usuario();
        usuario.setId( 1234L);
        usuario.setNombre("daniel");
        usuario.setApellido("de la rosa");
        usuario.setEmail("correo@correo");
        usuario.setTelefono("telefono");

        Usuario usuario2=new Usuario();
        usuario2.setId( 1235L);
        usuario2.setNombre("Claudia");
        usuario2.setApellido("de la rosa");
        usuario2.setEmail("correo@correo");
        usuario2.setTelefono("telefono");

        Usuario usuario3=new Usuario();
        usuario3.setId( 1236L);
        usuario3.setNombre("Pepe");
        usuario3.setApellido("de la rosa");
        usuario3.setEmail("correo@correo");
        usuario3.setTelefono("telefono");

        Usuario usuario4=new Usuario();
        usuario4.setId( 1237L);
        usuario4.setNombre("Cesar");
        usuario4.setApellido("de la rosa");
        usuario4.setEmail("correo@correo");
        usuario4.setTelefono("telefono");
        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        return usuarios;
    }

    @RequestMapping(value = "updU")
    public Usuario updateUsuario(){
        Usuario usuario=new Usuario();
        usuario.setNombre("daniel");
        usuario.setApellido("de la rosa");
        usuario.setEmail("correo@correo");
        usuario.setTelefono("telefono");
        return usuario;
    }

    @RequestMapping(value = "delU")
    public Usuario deleteUsuario(){
        Usuario usuario=new Usuario();
        usuario.setNombre("daniel");
        usuario.setApellido("de la rosa");
        usuario.setEmail("correo@correo");
        usuario.setTelefono("telefono");
        return usuario;
    }


}
