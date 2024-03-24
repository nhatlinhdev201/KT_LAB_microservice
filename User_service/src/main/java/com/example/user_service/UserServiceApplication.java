package com.example.user_service;

import com.example.user_service.models.User;
import com.example.user_service.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserServiceApplication {
    @Autowired
    private UserRepository repository;

    public static void main(String[] args) {

        SpringApplication.run(UserServiceApplication.class, args);

    }
    @Bean
    public CommandLineRunner loadData() {
        return args-> {
            User u1 = new User(1, "Nhat Linh 1");
            User u2 = new User(2, "Nhat Linh 2");
            repository.save(u1);
            repository.save(u2);
        };
    }

}
