package com.codeWithMosh.notificationSystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("sms")
@Primary
public class SmsNotificationService implements NotificationService{
    @Override
    public void send(String msg) {
        System.out.println("Message sent via Sms: "+ msg);
    }
}
