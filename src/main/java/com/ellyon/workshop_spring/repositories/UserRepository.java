package com.ellyon.workshop_spring.repositories;

import com.ellyon.workshop_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
