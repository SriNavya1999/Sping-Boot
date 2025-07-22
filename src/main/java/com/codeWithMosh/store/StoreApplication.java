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

		// Let's mark OrderService and PayPalPaymentService class as @Service. This will resolve the Beans
		// Not that we have not marked StripePaymentService as @Service. This will be throwing an error. We will resolve it later.

		// And Bean should have only 1 constructor.
		// If it is having multiple constructors without default one, it should mark the main constructor as @Autowired. Else it will throw an error.
		var orderService = context.getBean(OrderService.class);

		orderService.placeOrder();
	}

}
