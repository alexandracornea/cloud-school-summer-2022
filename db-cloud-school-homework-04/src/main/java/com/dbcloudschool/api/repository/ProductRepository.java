package com.dbcloudschool.api.repository;

import com.dbcloudschool.api.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    void delete(Product product);
}
