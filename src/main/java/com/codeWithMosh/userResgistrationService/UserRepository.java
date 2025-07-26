package com.codeWithMosh.userResgistrationService;

public interface UserRepository {
    User findByEmail(String email);

    void save(User user);
}
