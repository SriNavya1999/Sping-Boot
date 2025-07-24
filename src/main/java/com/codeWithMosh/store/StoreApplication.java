package com.codeWithMosh.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

		// ApplicationContext will not let the application exit. It will keep the application running.
		// If you want to exit the application, you need to use ConfigurableApplicationContext, you can call context.close() method.
		ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var orderService = context.getBean(OrderService.class);
		context.close();

	}

}
