package com.example.social_network.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

@Data
@Entity
@Table(name = "users")
public class User {

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Setter
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private boolean enable;

}