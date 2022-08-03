package com.dbcloudschool.api.repository;

import com.dbcloudschool.api.entities.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Orders, Integer> {
    List<Orders> findAll();
}
