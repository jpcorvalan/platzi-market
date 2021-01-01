package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();
    List<Product> getByCategory(int categoryId);
    Optional<Product> getProduct(int id);
    Product saveProduct(Product product);
    void deleteProductById(int productId);

}
