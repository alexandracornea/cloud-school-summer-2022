package com.dbcloudschool.api.service;

import com.dbcloudschool.api.entities.Orders;
import com.dbcloudschool.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Orders> getAllOrders() {
        List<Orders> orders = new ArrayList<>();
        orderRepository.findAll().iterator().forEachRemaining(orders::add);
        return orders;
    }

    public Orders getOrderById(Integer id) {
        return orderRepository.findById(id).get();
    }

    public Orders insertOrder(Orders order) {
        return orderRepository.save(order);
    }

    public Orders updateOrder(Orders order) {
        return orderRepository.save(order);
    }

    public void deleteOrderById(Integer id) {
        orderRepository.deleteById(id);
    }
}
