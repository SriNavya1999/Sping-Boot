package com.codeWithMosh.userResgistrationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        UserService userService = context.getBean(UserService.class);
        userService.register(new User(1, "John Doe", "john.doe@gmail.com", "password123"));
        userService.register(new User(1, "John Doe", "john.doe@gmail.com", "password123"));
    }
}
