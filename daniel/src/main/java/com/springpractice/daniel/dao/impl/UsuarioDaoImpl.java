package com.springpractice.daniel.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springpractice.daniel.dao.UsuarioDao;
import com.springpractice.daniel.models.Usuario;

import jakarta.transaction.Transactional;



@Repository
@Transactional
public class UsuarioDaoImpl implements UsuarioDao{

    @Override
    public List<Usuario> getUsuarios() {
        throw new UnsupportedOperationException("Unimplemented method 'getUsuarios'");
    }
    
}
