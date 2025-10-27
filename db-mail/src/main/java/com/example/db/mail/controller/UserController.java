package com.example.db.mail.controller;

import com.example.db.mail.entity.User;
import com.example.db.mail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User createUser(@ModelAttribute User user, @RequestParam("file") MultipartFile file ) throws IOException {
        if (file != null && !file.isEmpty()) {
            user.setFileName(file.getOriginalFilename());
            user.setFileType(file.getContentType());
            user.setFileData(file.getBytes());
        }
        return userService.createUser(user);
    }
}
