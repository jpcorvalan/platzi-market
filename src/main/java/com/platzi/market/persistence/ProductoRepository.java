package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;


    /**
     * Devuelve todos los productos de la base de datos en forma de lista
     * @return
     */
    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }


    /**
     * Devuelve una lista de productos dependiendo de la categoría que recibe por parámetro.
     * Se ordenarán por nombre de manera ascendente.
     * @param p_idCategoria
     * @return
     */
    public List<Producto> getByCategory(int p_idCategoria){
        //return productoCrudRepository.findByIdCategoria(p_idCategoria);

        // Si quisiéramos que nos retorne lo mismo, pero ordenado por algún valor, tendremos que ir a la interface
        // y modificar/crear el método agregando OrderBy(atributo)Asc/Desc
        // Efectuado el cambio, quedaría así:

        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(p_idCategoria);
    }


    /**
     * Obtiene un producto por su ID
     * @param p_id
     * @return
     */
    public Optional<Producto> getProducto(int p_id){
        return productoCrudRepository.findById(p_id);
    }


    /**
     * Guarda el producto recibido por parámetro en la base de datos
     * @param p_producto
     * @return
     */
    public Producto saveProducto(Producto p_producto){
        return productoCrudRepository.save(p_producto);
    }


    /**
     * Elimina un producto de la base de datos, en base a la ID (Llave primaria) que recibe por parámetro
     * @param p_idProducto
     */
    public void deleteProductoById(int p_idProducto){
        productoCrudRepository.deleteById(p_idProducto);
    }

}
