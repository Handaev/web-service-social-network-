package com.example.social_network.repository;

import com.example.social_network.entities.User;

import java.util.List;

public interface UserRepository{

    List<User> findAll();

    User findById(int id);

    void save(User account);

    void deleteById(int id);
}
