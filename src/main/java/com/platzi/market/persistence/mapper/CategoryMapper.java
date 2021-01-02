package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Category;
import com.platzi.market.persistence.entity.Categoria;
import com.sun.xml.bind.v2.util.StackRecorder;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "estado", target = "active")
    })
    Category toCategory(Categoria categoria);

    /* Nos podemos encontrar con casos donde necesitemos hacer una conversión a la inversa, para no copiar
    todo el código de nuevo, tan solo creamos el objeto, y agregamos la anotación de la siguiente manera  */

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);
}
