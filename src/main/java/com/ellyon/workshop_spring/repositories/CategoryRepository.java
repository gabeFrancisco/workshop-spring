package com.ellyon.workshop_spring.repositories;

import com.ellyon.workshop_spring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
