package getdemoDB.example.GetDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import getdemoDB.example.GetDemo.Entity.User;
import getdemoDB.example.GetDemo.repository.UserRepo;


@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private MailService mailService;

    public User addUser(User user){
        User savedUser = userRepo.save(user);
        mailService.sendUserCreationMail(user);
        return savedUser;
    }
    
}
