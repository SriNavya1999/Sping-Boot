package com.codeWithMosh.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

		// ApplicationContext is the IOC for Spring-Boot-Application
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

		// Method to get the Bean of OrderService Class.
		// This is going to throw an error as we have not yet configured the OrderService.class as a Bean
		var orderService = context.getBean(OrderService.class);

		orderService.placeOrder();
	}

}
