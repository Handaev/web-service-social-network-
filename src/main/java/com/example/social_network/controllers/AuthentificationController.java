package com.example.social_network.controllers;

import com.example.social_network.services.AuthentificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/authentification")
public class AuthentificationController {

    private final AuthentificationService authentificationService;

    private AuthentificationController(AuthentificationService authentificationService){
        this.authentificationService = authentificationService;
    }

    @GetMapping
    public ResponseEntity<String> authenticateUser(@RequestParam String email,
                                                   @RequestParam String password) {
        log.info("Authentication attempt for email: {}", email);
        authentificationService.findOfUser(email, password);
        return ResponseEntity.ok("Authentication successful for: " + email);
    }
}
