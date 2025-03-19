package com.ellyon.workshop_spring.repositories;

import com.ellyon.workshop_spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
