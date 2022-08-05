package com.dbcloudschool.api.service;

import com.dbcloudschool.api.dto.OrderDTO;
import com.dbcloudschool.api.entities.Orders;
import com.dbcloudschool.api.mapper.OrderMapper;
import com.dbcloudschool.api.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public List<OrderDTO> getAllOrders() {
        return orderRepository.findAll().stream()
                .map(orderMapper::toOrderDTO)
                .collect(Collectors.toList());
    }

    public OrderDTO getOrderById(Integer id) {
        return orderMapper.toOrderDTO(orderRepository.findById(id).get());
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
