package com.platzi.market.persistence.entity;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "productos")
public class Producto {


    //-----------------------------------------------------

    //----- Columnas de tabla -----

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_producto")
        private Integer idProducto;

        private String nombre;

        @Column(name = "id_categoria")
        private Integer idCategoria;

        @Column(name = "codigo_barras")
        private String codigoBarras;

        @Column(name = "precio_venta")
        private BigDecimal precioVenta;

        @Column(name = "cantidad_stock")
        private Integer cantidadStock;

        private Boolean estado;


    //-----------------------------------------------------

    //----- Relaciones entre tablas -----

        @ManyToOne
        @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
        private Categoria categoria;

    //-----------------------------------------------------

    //----- Setters -----
    private void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    private void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    private void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    private void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    private void setEstado(Boolean estado) {
        this.estado = estado;
    }




    //----- Getters -----
    public Integer getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }


    //-----------------------------------------------------
}
