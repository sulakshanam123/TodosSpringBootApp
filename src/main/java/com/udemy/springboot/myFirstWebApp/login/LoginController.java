package com.udemy.springboot.myFirstWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String goToLogin() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWelcome(@RequestParam String name, @RequestParam String password, ModelMap model) {

        // Authenticate
        if (this.authenticationService.authenticate(name, password)) {
            model.put("name", name);
            return "welcome";
        } else {
            model.put("errorMessage", "Invalid Credentials!! Please try again.");
            return "login";
        }
    }
}
