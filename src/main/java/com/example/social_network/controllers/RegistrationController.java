package com.example.social_network.controllers;

import com.example.social_network.entities.User;
import com.example.social_network.model.RegistrationRequest;
import com.example.social_network.services.RegistrationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(RegistrationRequest registrationRequest) {
        User user = registrationService.registerUser(registrationRequest);

        return "redirect:/login";
    }
}
