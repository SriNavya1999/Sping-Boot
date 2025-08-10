package com.codeWithMosh.store.repositories;

import com.codeWithMosh.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
  }