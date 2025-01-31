package com.max.reminder.controller;

import com.max.reminder.entity.EmailNotification;
import com.max.reminder.model.EmailNotificationRequest;
import com.max.reminder.service.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private EmailNotificationService emailNotificationService;

    @GetMapping(path = "/")
    public ResponseEntity<String> getAllNotifications() {
        List<EmailNotification> notifications = emailNotificationService.getAllEmailNotifications();
        return ResponseEntity.ok("Successfully Got");
    }

//    @GetMapping(path = "/")
//    public ResponseEntity<String> getNotification() {
//        return null;
//    }

    @PostMapping("/")
    public ResponseEntity<String> addEmailNotification(@RequestBody EmailNotificationRequest request) {
        emailNotificationService.saveEmailNotification(request);
        return ResponseEntity.ok("Successfully Added Notification");
    }
}
