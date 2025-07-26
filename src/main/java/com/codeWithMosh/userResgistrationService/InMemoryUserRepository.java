package com.codeWithMosh.userResgistrationService;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> users = new HashMap<>();

    @Override
    public User findByEmail(String email) {
        return users.get(email);
    }

    @Override
    public void save(User user) {
        users.put(user.getEmail(), user);
        System.out.println("User saved: ");
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("id: " + user.getId());
        System.out.println("--------------------------------------------------");
    }
}
