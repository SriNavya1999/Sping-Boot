package com.codeWithMosh.store.repositories;

import com.codeWithMosh.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
