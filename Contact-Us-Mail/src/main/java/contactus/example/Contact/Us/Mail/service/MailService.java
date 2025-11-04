package contactus.example.Contact.Us.Mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import contactus.example.Contact.Us.Mail.entity.User;

@Service
public class MailService {
    @Autowired
    private JavaMailSender mailSender;

    // public void sendUserCreationMail(String toEmail, String userName) {
    //     SimpleMailMessage message = new SimpleMailMessage();
    //     message.setFrom("shvmskyadav@gmail.com");
    //     message.setTo(toEmail);
    //     message.setSubject("Welcome to Aerosystem-website!");
    //     message.setText("Hi " + userName + ",\n\nYour account has been successfully created!");
    //     mailSender.send(message);
    // }

   
    public void sendUserCreationMail(User user) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("shvmskyadav@gmail.com"); 
        message.setTo(user.getEmail());            
        message.setSubject("User Created Successfully");
        message.setText("Welcome, " + user.getName());
        mailSender.send(message);
    }

//     public void sendUserCreationMail(User user) {
//     if (user.getEmail() == null || user.getEmail().isBlank()) {
//         System.out.println(" Email is missing for user: " + user);
//         return; // email null hai toh mail mat bhejna
//     }

//     SimpleMailMessage message = new SimpleMailMessage();
//     message.setFrom("shvmskyadav@gmail.com");
//     message.setTo(user.getEmail());
//     message.setSubject("User Created Successfully");
//     message.setText("Welcome, " + user.getName());
//     mailSender.send(message);

//     System.out.println(" Mail sent to: " + user.getEmail());
// }

}
