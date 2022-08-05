package com.dbcloudschool.api.controller;

import com.dbcloudschool.api.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("customers")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("view")
    public String viewAllCustomers(Model model) {
        model.addAttribute("allCustomers", customerService.getAllCustomers());
        return "customers";
    }

    @GetMapping("view/id={id}")
    public String viewCustomersById(@PathVariable Integer id, Model model) {
        model.addAttribute("customerById", customerService.getCustomerById(id));
        return "customers";
    }

    @GetMapping("view/username={username}")
    public String viewCustomerByUsername(@PathVariable String username, Model model) {
        model.addAttribute("customerByUsername", customerService.getCustomerByUsername(username));
        return "customers";
    }

    @GetMapping("view/city={city}")
    public String viewCustomersByCity(@PathVariable String city, Model model) {
        model.addAttribute("customersByCity", customerService.getCustomersByCity(city));
        return "customers";
    }

    @GetMapping("view/country={country}")
    public String viewCustomersByCountry(@PathVariable String country, Model model) {
        model.addAttribute("customersByCountry", customerService.getCustomersByCountry(country));
        return "customers";
    }
}
