package contactus.example.Contact.Us.Mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import contactus.example.Contact.Us.Mail.entity.User;
import contactus.example.Contact.Us.Mail.service.UserService;


@RestController
@CrossOrigin(origins = "*")
public class UserControlller {

    @Autowired
    private UserService userService;

    @PostMapping("/us")
    public User createUser( User user) {
        return userService.createUser(user);
    }
    
//     @PostMapping("/us")
// public createUser(@ModelAttribute User user) {
//     userService.createUser(user);
//     return ResponseEntity.ok("Mail sent successfully!");
// }

    
}
