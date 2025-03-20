package com.ellyon.workshop_spring.repositories;

import com.ellyon.workshop_spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
