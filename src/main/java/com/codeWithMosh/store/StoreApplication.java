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

		// Bean Scopes: There are 4 main diff Scopes for Beans in Spring
		// 1. Singleton: Only one instance of the bean is created and shared across the application.
		// 2. Prototype: A new instance of the bean is created every time it is requested.
		// 3. Request: A new instance of the bean is created for each HTTP request. And is destroyed at the end of the request.
		// 4. Session: A new instance of the bean is created for each HTTP session. And is destroyed at the end of the session.

		// HeavyResource is a bean created only once as it is a singleton bean.
		HeavyResource heavyResource = context.getBean(HeavyResource.class);
		HeavyResource heavyResource1 = context.getBean(HeavyResource.class);

		// OrderService is marked as a prototype bean in AppConfig.java. So, orderService1 and orderService2 are different instances.
		OrderService orderService1 = context.getBean(OrderService.class);
		OrderService orderService2 = context.getBean(OrderService.class);


//		System.out.println("Spring Boot Application Started");
//
//		var orderService = context.getBean(OrderService.class);
//
//		orderService.placeOrder();
	}

}
