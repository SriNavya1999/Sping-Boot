package com.codeWithMosh.store;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    // This class can be used to define beans and configurations for the application.
    // For example, you can use @Bean annotations to create beans that will be managed by the Spring container.

    // Example:
    // @Bean
    // public OrderService orderService(PaymentService paymentService) {
    //     return new OrderService(paymentService);
    // }

    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal(){
        return new PayPalPaymentService();
    }

    @Bean
    public OrderService orderService(){
        return new OrderService(stripe());
    }


}
