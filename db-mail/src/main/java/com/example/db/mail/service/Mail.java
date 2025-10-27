package com.example.db.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class Mail {
    @Autowired
    private JavaMailSender mailSender;

    public void sendUserCreationMail(String toEmail, String userName, String companyName) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("shvmskyadav@gmail.com");
        message.setTo(toEmail);
        message.setSubject("Welcome to Aerosystem-website!");
        message.setText("Hi " + userName + ",\n\nYour account has been successfully created!");
        mailSender.send(message);
    }
}
