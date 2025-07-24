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

		// If we mark both PayPalPaymentService.java and StripePaymentService.java both as @Service we will get an error saying Bean is not able to resolve. "Parameter 0 of constructor in com.codeWithMosh.store.OrderService required a single bean, but 2 were found:"
		// To overcome this, we can use 2 different annotations
		// @Primary -> When multiple beans are present, primary bean will be used always.
		// In case if some class doesn't want to go with @Primary bean, we can set a @Qualifier("service_name") bean.
		var orderService = context.getBean(OrderService.class);

		orderService.placeOrder();
	}

}
