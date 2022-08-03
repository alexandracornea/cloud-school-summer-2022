package com.dbcloudschool.api.repository;

import com.dbcloudschool.api.entities.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findAll();

    Optional<Customer> findById(Integer id);

    void deleteById(Integer id);
}
