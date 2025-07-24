package com.codeWithMosh.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("stripe")
@Primary
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(Integer amount){
        System.out.println("STRIPE");
        System.out.println("amount : " + amount + " is paid.");
    }
}
