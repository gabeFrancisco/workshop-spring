package com.ellyon.workshop_spring.services;

import com.ellyon.workshop_spring.entities.Order;
import com.ellyon.workshop_spring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id){
       Optional<Order> order = orderRepository.findById(id);
       return order.get();
    }
}
