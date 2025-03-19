package com.ellyon.workshop_spring.services;

import com.ellyon.workshop_spring.entities.Category;
import com.ellyon.workshop_spring.entities.User;
import com.ellyon.workshop_spring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
       Optional<Category> user = categoryRepository.findById(id);
       return user.get();
    }
}
