package com.example.db.mail.service;

import com.example.db.mail.entity.User;
import com.example.db.mail.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;


    @Autowired
    private Mail mailService;


    public User createUser(User user) {
        User savedUser = userRepo.save(user);


        mailService.sendUserCreationMail(savedUser.getEmail(), savedUser.getName(), savedUser.getCompanyName());
        return savedUser;
    }
}
