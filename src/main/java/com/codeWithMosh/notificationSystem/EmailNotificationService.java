package com.codeWithMosh.notificationSystem;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String msg) {
        System.out.println("Message sent via Email: "+ msg);
    }
}
