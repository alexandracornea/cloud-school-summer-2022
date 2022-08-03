package com.dbcloudschool.api.controller;

import com.dbcloudschool.api.entities.Customer;
import com.dbcloudschool.api.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customers/all")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
