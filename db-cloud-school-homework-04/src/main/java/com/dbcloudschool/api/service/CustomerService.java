package com.dbcloudschool.api.service;


import com.dbcloudschool.api.entities.Customer;
import com.dbcloudschool.api.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    List<Customer> customers = new ArrayList<>();

    public List<Customer> getAllCustomers() {
        List<Customer> tmp = new ArrayList<>();
        customerRepository.findAll().iterator().forEachRemaining(tmp::add);
        return tmp;
    }
}
