package com.codeWithMosh.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {

    @Value("${stripe.url}")
    private String apiURL;

    // stripe.timeout = 1000, if no value is provided in the .properties or .yaml file
    @Value("${stripe.timeout:1000}")
    private int timeout;

    @Value("${stripe.enable}")
    private boolean enable;

    @Value("${stripe.supported-currencies}")
    private List<String> currencies;


    @Override
    public void processPayment(Integer amount){
        System.out.println("STRIPE");
        System.out.println("apiURL: " + apiURL);
        System.out.println("timeout: " + timeout);
        System.out.println("enable: " + enable);
        System.out.println("currencies: " + currencies);
        System.out.println("amount : " + amount + " is paid.");
    }
}
