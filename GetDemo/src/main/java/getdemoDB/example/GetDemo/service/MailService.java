package getdemoDB.example.GetDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import getdemoDB.example.GetDemo.Entity.User;


@Service
public class MailService {
     @Autowired
    private JavaMailSender mailSender;

     public void sendUserCreationMail(User user) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("shvmskyadav@gmail.com"); 
        message.setTo(user.getEmail());            
        message.setSubject("User Created Successfully");
        message.setText("Welcome, " + user.getFirstName());
        mailSender.send(message);
    }
}
