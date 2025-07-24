package com.codeWithMosh.notificationSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String [] args){
        ApplicationContext context = SpringApplication.run(Application.class, args);
        NotificationManager notificationManager = context.getBean(NotificationManager.class);

        notificationManager.sendNotification("Hello World!!!");
    }
}
