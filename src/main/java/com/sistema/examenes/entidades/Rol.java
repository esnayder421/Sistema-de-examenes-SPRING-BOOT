package com.sistema.examenes.entidades;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Rol {
    @Id
    private long rol_id;

    private String nombre;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "rol")
    private Set<Usuario_rol> usuario_roles = new HashSet<>();

    public long getRol_id() {
        return rol_id;
    }

    public void setRol_id(long rol_id) {
        this.rol_id = rol_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Usuario_rol> getUsuario_roles() {
        return usuario_roles;
    }

    public void setUsuario_roles(Set<Usuario_rol> usuario_roles) {
        this.usuario_roles = usuario_roles;
    }

    public Rol(){

    }


}
