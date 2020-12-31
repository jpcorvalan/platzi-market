package com.platzi.market.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {

    //-----------------------------------------------------

    //----- Columnas de Tabla -----

        @EmbeddedId
        private ComprasProductoPK id;

        private Integer cantidad;

        private Double total;

        private Boolean estado;

    //-----------------------------------------------------

    //----- Relaciones entre tablas -----

        @ManyToOne
        @JoinColumn(name = "id_compra", insertable = false, updatable = false)
        private Compra compra;


        @ManyToOne
        @JoinColumn(name = "id_producto", insertable = false, updatable = false)
        private Producto producto;

    //-----------------------------------------------------




    //-----Setters-----
    private void setId(ComprasProductoPK id) {
        this.id = id;
    }

    private void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    private void setTotal(Double total) {
        this.total = total;
    }

    private void setEstado(Boolean estado) {
        this.estado = estado;
    }




    //-----Getters-----
    public ComprasProductoPK getId() {
        return id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public Boolean getEstado() {
        return estado;
    }
}
