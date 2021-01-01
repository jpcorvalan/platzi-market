package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoria(int idCategoria);


    //Este método devolverá los mismos productos pero ordenados en este caso por Nombre
    //Si quisiéramos especificar otro atributo de ordenamiento, solo lo especificamos, respetando el camel case
    //Asc/Desc ordenará de forma ascendente o descendente respectivamente.
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

}
