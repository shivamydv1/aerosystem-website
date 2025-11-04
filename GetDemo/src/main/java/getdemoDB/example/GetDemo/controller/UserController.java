package getdemoDB.example.GetDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import getdemoDB.example.GetDemo.Entity.User;
import getdemoDB.example.GetDemo.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User addUser (@ModelAttribute User user) {
        return userService.addUser(user);
    }
}
