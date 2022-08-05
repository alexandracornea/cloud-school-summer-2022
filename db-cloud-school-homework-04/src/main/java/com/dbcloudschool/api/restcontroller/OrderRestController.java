package com.dbcloudschool.api.restcontroller;

import com.dbcloudschool.api.dto.OrderDTO;
import com.dbcloudschool.api.entities.Orders;
import com.dbcloudschool.api.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("orders")
public class OrderRestController {
    private final OrderService orderService;

    @GetMapping("all")
    public List<OrderDTO> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("{id}")
    public OrderDTO getOrderById(@PathVariable Integer id) {
        return orderService.getOrderById(id);
    }

    @PostMapping
    public Orders insertOrder(@RequestBody Orders order) {
        return orderService.insertOrder(order);
    }

    @PutMapping
    public Orders updateOrder(@RequestBody Orders order) {
        return orderService.updateOrder(order);
    }

    @DeleteMapping("{id}")
    public void deleteOrderById(@PathVariable Integer id) {
        orderService.deleteOrderById(id);
    }
}
