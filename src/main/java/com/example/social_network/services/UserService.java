package com.example.social_network.services;

import com.example.social_network.entities.User;
import com.example.social_network.repository.RegistrationDAO;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final RegistrationDAO registrationDAO;

    public  UserService(RegistrationDAO registrationDAO){
        this.registrationDAO = registrationDAO;
    }

    public User createUser(User user) {
        return registrationDAO.save(user);
    }

        public User getUserByEmail(String email) {
        return registrationDAO.findByEmail(email);
    }
}
