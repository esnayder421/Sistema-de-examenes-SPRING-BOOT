package com.sistema.examenes.servicios;

import com.sistema.examenes.entidades.Usuario;
import com.sistema.examenes.entidades.Usuario_rol;

import java.util.Set;

public interface Usuario_service {

    public Usuario guardar_usuario(Usuario usuario, Set<Usuario_rol> usuario_roles) throws Exception;

}
