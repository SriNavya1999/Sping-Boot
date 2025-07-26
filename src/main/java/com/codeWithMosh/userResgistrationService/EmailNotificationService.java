package com.codeWithMosh.userResgistrationService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService{

    @Value("${user-service.email.port}")
    private int port;

    @Value("${user-service.email.host}")
    private String host;

    @Override
    public void send(String message, String email) {
        System.out.println("Welcome email is sent to....");
        System.out.println("Receipient: " + email);
        System.out.println("Message: " + message);
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);
        System.out.println("Email sent successfully!");
        System.out.println("--------------------------------------------------");
    }
}
