package com.dbcloudschool.api.controller;

import com.dbcloudschool.api.entities.Orders;
import com.dbcloudschool.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/orders/all")
    public List<Orders> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    public Orders getOrderById(@PathVariable Integer id) {
        return orderService.getOrderById(id);
    }

    @PostMapping("/orders")
    public Orders insertOrder(@RequestBody Orders order) {
        return orderService.insertOrder(order);
    }

    @PutMapping("/orders")
    public Orders updateOrder(@RequestBody Orders order) {
        return orderService.updateOrder(order);
    }

    @DeleteMapping("/orders/{id}")
    public void deleteOrderById(@PathVariable Integer id) {
        orderService.deleteOrderById(id);
    }
}
