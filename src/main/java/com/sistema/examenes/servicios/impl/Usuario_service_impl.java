package com.sistema.examenes.servicios.impl;

import com.sistema.examenes.entidades.Usuario;
import com.sistema.examenes.entidades.Usuario_rol;
import com.sistema.examenes.repositorios.Rol_repository;
import com.sistema.examenes.repositorios.Usuario_repository;
import com.sistema.examenes.servicios.Usuario_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class Usuario_service_impl implements Usuario_service {

    @Autowired
    private Usuario_repository usuario_repository;

    @Autowired
    private Rol_repository rol_repository;

    @Override
    public Usuario guardar_usuario(Usuario usuario, Set<Usuario_rol> usuario_roles) throws Exception {


        Usuario Usuario_local = usuario_repository.findByUsername(usuario.getUsername());

        if(Usuario_local != null){
            System.out.println("el usuario ya existe ");

            throw new Exception("El usuario ya esta presente");
        }
        else {
            for(Usuario_rol usuario_rol:usuario_roles){
                rol_repository.save(usuario_rol.getRol());

            }
        }

    }
}
