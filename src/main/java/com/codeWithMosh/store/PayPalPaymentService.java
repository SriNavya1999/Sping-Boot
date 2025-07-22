package com.codeWithMosh.store;

public class PayPalPaymentService implements PaymentService{
    @Override
    public void processPayment(Integer amount) {
        System.out.println("PAYPAL");
        System.out.println("amount : " + amount + " is paid.");
    }
}
