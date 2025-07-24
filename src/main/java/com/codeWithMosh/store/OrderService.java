package com.codeWithMosh.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {

    private PaymentService paymentService;

    OrderService(){}

    @Autowired
    OrderService(PaymentService paymentService){
        System.out.println("OrderService constructor called");
        this.paymentService = paymentService;
    }

    // Method which calls immediately after the constructor (bean is created) is called to do some initialization
    @PostConstruct
    public void init(){
        System.out.println("OrderService post construct is called.....");
    }

    // Method which calls before the bean is destroyed to do some cleanUp
    @PreDestroy
    public void cleanUp(){
        System.out.println("OrderService clean up is called.....");
    }

    public void placeOrder(){
        paymentService.processPayment(100);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
