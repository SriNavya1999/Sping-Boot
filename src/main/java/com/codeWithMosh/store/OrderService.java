package com.codeWithMosh.store;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private PaymentService paymentService;

    OrderService(PaymentService paymentService, Integer integer){}

    OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.processPayment(100);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
