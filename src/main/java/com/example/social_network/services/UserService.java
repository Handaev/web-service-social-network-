//package com.example.social_network.services;
//
//import com.example.social_network.entities.User;
//import com.example.social_network.repository.UserRepositoryDAO;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserService {
//
//    private final UserRepositoryDAO userRepository;
//
//    public  UserService(UserRepositoryDAO userRepository){
//        this.userRepository = userRepository;
//    }
//
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    public User getUserById(int id) {
//        return userRepository.findById(id);
//    }
//
//    public User createUser(User user) {
//        return userRepository.save(user);
//    }
//
//    public void deleteUser(int id) {
//        userRepository.deleteById(id);
//    }
//}
