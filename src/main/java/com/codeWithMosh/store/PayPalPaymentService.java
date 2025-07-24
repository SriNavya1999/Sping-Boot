package com.codeWithMosh.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("paypal")
public class PayPalPaymentService implements PaymentService{
    @Override
    public void processPayment(Integer amount) {
        System.out.println("PAYPAL");
        System.out.println("amount : " + amount + " is paid.");
    }
}
