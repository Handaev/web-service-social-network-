package com.example.social_network.repository;

import com.example.social_network.entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    List<User> findAll();

    User findById(int id);

    User save(User account);

    void update(User user);

    void deleteById(int id);
}
