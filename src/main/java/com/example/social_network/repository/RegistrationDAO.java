package com.example.social_network.repository;


import com.example.social_network.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationDAO {
    void save(User user);

}
