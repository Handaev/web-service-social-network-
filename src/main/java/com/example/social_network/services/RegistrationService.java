package com.example.social_network.services;

import com.example.social_network.entities.User;
import com.example.social_network.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private final UserRepository registrationDAO;

    public RegistrationService(UserRepository registrationDAO){
        this.registrationDAO = registrationDAO;
    }

    public User createUser(User user) {
        return registrationDAO.save(user);
    }


}
