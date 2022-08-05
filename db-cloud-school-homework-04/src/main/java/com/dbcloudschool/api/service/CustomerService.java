package com.dbcloudschool.api.service;

import com.dbcloudschool.api.dto.CustomerDTO;
import com.dbcloudschool.api.entities.Customer;
import com.dbcloudschool.api.mapper.CustomerMapper;
import com.dbcloudschool.api.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.findAll().stream()
                .map(customerMapper::toCustomerDTO)
                .collect(Collectors.toList());
    }

    public CustomerDTO getCustomerById(Integer id) {
        return customerMapper.toCustomerDTO(customerRepository.findById(id).get());
    }

    public CustomerDTO getCustomerByUsername(String username) {
        return customerMapper.toCustomerDTO(customerRepository.findByUsername(username).get());
    }

    public List<CustomerDTO> getCustomersByCity(String city) {
        return customerRepository.findAll().stream()
                .filter(customer -> {
                    if (customer.getCity() == null) {
                        return false;
                    }
                    return customer.getCity().equals(city);
                })
                .map(customerMapper::toCustomerDTO)
                .collect(Collectors.toList());
    }

    public List<CustomerDTO> getCustomersByCountry(String country) {
        return customerRepository.findAll().stream()
                .filter(customer -> {
                    if (customer.getCountry() == null) {
                        return false;
                    }
                    return customer.getCountry().equals(country);
                })
                .map(customerMapper::toCustomerDTO)
                .collect(Collectors.toList());
    }

    public Customer insertCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomerById(Integer id) {
        customerRepository.deleteById(id);
    }
}
