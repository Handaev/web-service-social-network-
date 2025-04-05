package com.example.social_network.services;

import com.example.social_network.entities.User;
import com.example.social_network.repository.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class AuthentificationService {
    private UserRepository registrationDAO;

    public AuthentificationService(UserRepository registrationDAO){
        this.registrationDAO = registrationDAO;
    }

    public void findOfUser(String email, String password){
        User user = new User(email, password);

    }
}
