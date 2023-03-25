package com.springpractice.daniel.controllers;

import com.springpractice.daniel.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "getUs/")
    public List<Usuario> getUsuarios(){
        Usuario usuario=new Usuario();
        usuario.setId(id);
        usuario.setNombre("daniel");
        usuario.setApellido("de la rosa");
        usuario.setEmail("correo@correo");
        usuario.setTelefono("telefono");
        return usuario;
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
