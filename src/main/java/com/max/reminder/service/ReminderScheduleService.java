package com.max.reminder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ReminderScheduleService {

    @Autowired
    private EmailNotificationService emailNotificationService;

    public void sendNotification() {
//        emailService.sendEmail("testing@outlook.com", "Don't be a dumb dork");
    }
}
