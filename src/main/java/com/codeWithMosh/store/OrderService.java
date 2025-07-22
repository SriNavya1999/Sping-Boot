package com.codeWithMosh.store;

public class OrderService {
    private PaymentService paymentService;

    OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    public void placeOrder(){
        paymentService.processPayment(100);
    }
}
