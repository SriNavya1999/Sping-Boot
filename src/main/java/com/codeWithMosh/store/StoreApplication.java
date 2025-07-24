package com.codeWithMosh.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

		// ApplicationContext is the IOC for Spring-Boot-Application
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		context.getBean(HeavyResource.class);

//		System.out.println("Spring Boot Application Started");
//
//		var orderService = context.getBean(OrderService.class);
//
//		orderService.placeOrder();
	}

}
