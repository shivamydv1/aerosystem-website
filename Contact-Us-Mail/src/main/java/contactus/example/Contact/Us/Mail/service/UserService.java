package contactus.example.Contact.Us.Mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import contactus.example.Contact.Us.Mail.entity.User;
import contactus.example.Contact.Us.Mail.repository.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;


    @Autowired
    private MailService mailService;


    public User createUser(User user) {
        User savedUser = userRepo.save(user);
        mailService.sendUserCreationMail(user);
        return savedUser;
    }
}
