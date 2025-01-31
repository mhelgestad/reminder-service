package com.max.reminder.service;

import com.max.reminder.entity.EmailNotification;
import com.max.reminder.model.EmailNotificationRequest;
import com.max.reminder.repository.EmailNotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailNotificationService {

    @Autowired
    private EmailNotificationRepository emailNotificationRepository;

//    @Autowired
//    private JavaMailSender mailSender;

    public List<EmailNotification> getAllEmailNotifications() {
        return emailNotificationRepository.findAll();
    }

    public void saveEmailNotification(EmailNotificationRequest request) {
        EmailNotification entity = new EmailNotification();
        entity.setRecipient(request.getRecipient());
        entity.setSubject(request.getSubject());
        entity.setBody(request.getBody());
        entity.setSchedule(request.getSchedule());
        emailNotificationRepository.save(entity);
    }

//    public void sendEmail(String recipient, String message) {
//        SimpleMailMessage email = new SimpleMailMessage();
//        email.setTo(recipient);
//        email.setSubject("Your Daily Reminder");
//        email.setText(message);
//        mailSender.send(email);
//    }
}
