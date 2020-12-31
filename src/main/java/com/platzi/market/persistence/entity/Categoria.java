package com.platzi.market.persistence.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {

    //-----------------------------------------------------

    //----- Columnas de Tabla -----

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_categoria")
        private Integer idCategoria;

        private String descripcion;

        private Boolean estado;

    //-----------------------------------------------------

    //----- Relaciones entre tablas -----

        @OneToMany(mappedBy = "categoria")
        private List<Producto> productos;

    //-----------------------------------------------------


    //-----Setters-----
    private void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private void setEstado(Boolean estado) {
        this.estado = estado;
    }




    //-----Getters-----
    public Integer getIdCategoria() {
        return idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }
}
