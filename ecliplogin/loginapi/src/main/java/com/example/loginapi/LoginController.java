package com.example.loginapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private static final String USERNAME = "tuan136";
    private static final String PASSWORD = "13062005";

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        if (USERNAME.equals(user.getUsername()) && PASSWORD.equals(user.getPassword())) {
            return "Log in";
        } else {
            return "None";
        }
    }
}