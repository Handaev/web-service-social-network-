package com.example.social_network.repository;


import com.example.social_network.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    @Query("SELECT * FROM Users as u WHERE u.email = :email")
    User findByEmail(@Param("email") String email);

}
