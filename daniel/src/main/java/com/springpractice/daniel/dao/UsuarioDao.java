package com.springpractice.daniel.dao;

import java.util.List;

import com.springpractice.daniel.models.Usuario;

public interface UsuarioDao {
    List<Usuario> getUsuarios();

    void deleteUser(Long id);
    void addUser(Usuario usuario);
       

        
    
    
}
