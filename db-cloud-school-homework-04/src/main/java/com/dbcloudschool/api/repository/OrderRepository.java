package com.dbcloudschool.api.repository;

import com.dbcloudschool.api.entities.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends CrudRepository<Orders, Integer> {
    List<Orders> findAll();

    Optional<Orders> findById(Integer id);

    void deleteById(Integer id);
}
