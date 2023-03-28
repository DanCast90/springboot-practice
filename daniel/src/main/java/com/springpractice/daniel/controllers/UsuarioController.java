package com.springpractice.daniel.controllers;

import com.springpractice.daniel.dao.UsuarioDao;
import com.springpractice.daniel.models.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    
    @RequestMapping(value = "api/getUs")
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/updU")
    public Usuario updateUsuario(){
        Usuario usuario=new Usuario();
        usuario.setNombre("daniel");
        usuario.setApellido("de la rosa");
        usuario.setEmail("correo@correo");
        usuario.setTelefono("telefono");
        return usuario;
    }

    @RequestMapping(value = "api/getU/{id}",method = RequestMethod.DELETE)
    public void deleteUsuario(@PathVariable Long id){
       usuarioDao.deleteUser(id);
    }

    @RequestMapping(value = "api/addUs", method = RequestMethod.POST)
    public void addUsuarios(@RequestBody Usuario usuario){
        usuarioDao.addUser(usuario);
    }

}
