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
		/** Beans can be configured by Annotations. There are 4 types of Annotations to configure beans:
		 * 1. @Component --> General purpose Annotation --> @Service annotation is an alias to this.
		 * 2. @Service --> Tells that the class is a service class containing the business logic.
		 * 3. @Repository --> Tells that the class is a repository class containing the interactions with DB.
		 * 4. @Controller --> Tells that the class is a Controller class, Handles the Web requests.
 		 */

		// Let's mark OrderService class as @Service.
		// It still fails as it will not be able to resolve PaymentService.
		var orderService = context.getBean(OrderService.class);

		orderService.placeOrder();
	}

}
