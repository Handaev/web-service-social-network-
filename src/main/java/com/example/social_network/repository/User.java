package com.example.social_network.repository;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Calendar;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "firstName should be valid!")
    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    @NotBlank(message = "lastName should be valid!")
    private String lastName;

    @Column(name = "email")
    @Email(message = "Email should be valid!")
    private String email;

    @Column(name = "password")
    @Size(min = 5, max = 20,
            message = "Password must be between 5 and 20 characters!")
    private String password;

    @Column(name = "dateregistration")
    private Date dateRegistration = Calendar.getInstance().getTime();

}
