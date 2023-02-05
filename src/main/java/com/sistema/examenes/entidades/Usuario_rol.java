package com.sistema.examenes.entidades;

import javax.persistence.*;

@Entity
public class Usuario_rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuario_rol_od;


    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;


    @ManyToOne
    private Rol rol;

    public Long getUsuario_rol_od() {
        return usuario_rol_od;
    }

    public void setUsuario_rol_od(Long usuario_rol_od) {
        this.usuario_rol_od = usuario_rol_od;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Usuario_rol(){

    }


}
