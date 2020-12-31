package com.platzi.market.persistence.entity;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compra {

    //-----------------------------------------------------

    //----- Columnas de tabla -----

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_compra")
        private Integer idCompra;

        @Column(name = "id_cliente")
        private String idCliente;

        private LocalDateTime fecha;

        @Column(name = "medio_pago")
        private String medioPago;

        private String comentario;

        private String estado;

    //-----------------------------------------------------

    //----- Relación entre tablas -----

        @ManyToOne
        @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
        private Cliente cliente;

        @OneToMany(mappedBy = "producto")
        private List<ComprasProducto> productos;

    //-----------------------------------------------------

    //----- Setters -----
    private void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    private void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    private void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    private void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    private void setComentario(String comentario) {
        this.comentario = comentario;
    }

    private void setEstado(String estado) {
        this.estado = estado;
    }




    //----- Getters -----
    public Integer getIdCompra() {
        return idCompra;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public String getEstado() {
        return estado;
    }
}
