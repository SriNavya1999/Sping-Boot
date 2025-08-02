package com.codeWithMosh.store;

import com.codeWithMosh.store.entities.Address;
import com.codeWithMosh.store.entities.Profile;
import com.codeWithMosh.store.entities.Tag;
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

		Profile profile = Profile.builder()
				.bio("bio")
				.build();

		user.addProfile(profile);

		System.out.println(user);
	}

}
