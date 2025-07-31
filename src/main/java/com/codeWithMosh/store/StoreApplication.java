package com.codeWithMosh.store;

import com.codeWithMosh.store.entities.Address;
import com.codeWithMosh.store.entities.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		var user = User.builder()
				.id(1L)
				.name("John")
				.email("john@gmail.com")
				.password("123")
				.build();

		var address = Address.builder()
				.street("street")
				.city("city")
				.state("state")
				.zip("zip")
				.build();

		user.addAddress(address);

		System.out.println(user);
	}

}
