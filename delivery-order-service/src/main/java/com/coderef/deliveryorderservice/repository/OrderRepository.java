package com.coderef.deliveryorderservice.repository;

import com.coderef.deliveryorderservice.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
