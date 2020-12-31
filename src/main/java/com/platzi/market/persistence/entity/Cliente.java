package com.platzi.market.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    //-----------------------------------------------------

    //----- Columnas de tabla -----

        @Id
        private String id;

        private String nombre;

        private String apellidos;

        private Long celular;

        private String direccion;

        @Column(name = "correo_electronico")
        private String correoElectronico;

    //-----------------------------------------------------

    //----- Relaciones entre tablas -----

        @OneToMany(mappedBy = "cliente")
        private List<Compra> compras;

    //-----------------------------------------------------

    //----- Setters -----
    private void setId(String id) {
        this.id = id;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    private void setCelular(Long celular) {
        this.celular = celular;
    }

    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }




    //-----Getters-----
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Long getCelular() {
        return celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}
