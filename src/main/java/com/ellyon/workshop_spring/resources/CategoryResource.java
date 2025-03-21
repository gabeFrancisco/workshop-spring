package com.ellyon.workshop_spring.resources;

import com.ellyon.workshop_spring.entities.Category;
import com.ellyon.workshop_spring.entities.User;
import com.ellyon.workshop_spring.services.CategoryService;
import com.ellyon.workshop_spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category cat = service.findById(id);
        return ResponseEntity.ok().body(cat);
    }
}
