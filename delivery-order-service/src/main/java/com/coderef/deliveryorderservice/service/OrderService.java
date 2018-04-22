package com.coderef.deliveryorderservice.service;


import com.coderef.deliveryorderservice.model.Order;
import com.coderef.deliveryorderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order save(@Validated Order order) {
        return orderRepository.save(order);
    }

    public Order findById(Integer id){
        Optional<Order> optional = orderRepository.findById(id);
        return optional.get();
    }

    public Iterable<Order> findAll(){
        return orderRepository.findAll();
    }

    public void delete(Integer id) {
        Order order =  findById(id);
        if (order != null) orderRepository.delete(order);
    }
}
