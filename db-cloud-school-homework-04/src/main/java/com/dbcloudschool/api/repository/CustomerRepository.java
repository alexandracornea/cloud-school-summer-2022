package com.dbcloudschool.api.repository;

import com.dbcloudschool.api.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    Customer getById(String customerId);
}
