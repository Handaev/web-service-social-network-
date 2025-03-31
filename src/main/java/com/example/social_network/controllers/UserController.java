package com.example.social_network.controllers;

import com.example.social_network.entities.User;
import com.example.social_network.services.UserService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/register")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/registration")
    public ResponseEntity<User> registerUser(@Valid @RequestBody User user) {
        log.info("Registering new user with email: {}", user.getEmail());
        User createdUser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    // Аутентификация (обычно возвращает токен)
    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticateUser(@RequestParam String email,
                                                   @RequestParam String password) {
        log.info("Authentication attempt for email: {}", email);
        // Здесь должна быть логика аутентификации
        return ResponseEntity.ok("Authentication successful for: " + email);
    }
}
