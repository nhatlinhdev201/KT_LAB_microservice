package com.example.user_service.controller;

import com.example.user_service.models.User;
import com.example.user_service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/users")
    private List<User> getUsers() {
        return userService.getAlUsers();
    }

    @GetMapping("users/{id}")
    private User getUserById(@PathVariable long id) {
        return  userService.getUserById(id);
    }
}
