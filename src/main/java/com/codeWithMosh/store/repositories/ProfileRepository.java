package com.codeWithMosh.store.repositories;

import com.codeWithMosh.store.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}