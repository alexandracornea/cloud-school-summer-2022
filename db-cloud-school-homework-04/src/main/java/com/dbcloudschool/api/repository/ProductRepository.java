package com.dbcloudschool.api.repository;

import com.dbcloudschool.api.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findAll();

    Optional<Product> findById(Integer id);

    void deleteById(Integer id);

    void delete(Product product);
}
