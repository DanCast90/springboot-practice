package com.springpractice.daniel.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springpractice.daniel.dao.UsuarioDao;
import com.springpractice.daniel.models.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;



@Repository
@Transactional
public class UsuarioDaoImpl implements UsuarioDao{
    
    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<Usuario> getUsuarios() {
        String query="FROM Usuario";
        return entityManager.createQuery(query).getResultList();
        
    }


    @Override
    public void deleteUser(Long id) {
        Usuario usuario=entityManager.find(Usuario.class,id);
        entityManager.remove(usuario);
    }


    @Override
    public void addUser(Usuario usuario) {
        entityManager.merge(usuario);
    }
    
}
