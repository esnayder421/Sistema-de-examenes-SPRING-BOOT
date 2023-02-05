package com.sistema.examenes.repositorios;

import com.sistema.examenes.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Usuario_repository extends JpaRepository<Usuario,Long> {

    //buscar por nombre (metodo propio de spring)
    public Usuario findByUsername(String username);

}
