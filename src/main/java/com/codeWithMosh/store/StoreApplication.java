package com.codeWithMosh.store;

import com.codeWithMosh.store.entities.*;
import com.codeWithMosh.store.repositories.UserRepository;
import com.codeWithMosh.store.services.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		UserService userService = context.getBean(UserService.class);

		userService.showRelatedEntities();

	}

}
