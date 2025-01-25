package com.udemy.springboot.myFirstWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        return "in28minutes".equalsIgnoreCase(username) && "dummy".equalsIgnoreCase(password);
    }
}
