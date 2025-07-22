package com.codeWithMosh.store;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(Integer amount){
        System.out.println("STRIPE");
        System.out.println("amount : " + amount + " is paid.");
    }
}
