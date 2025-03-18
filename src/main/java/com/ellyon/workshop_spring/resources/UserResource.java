package com.ellyon.workshop_spring.resources;

import com.ellyon.workshop_spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Gabriel", "gabe@mail.com", "519987833", "1234");
        return ResponseEntity.ok().body(u);
    }
}
