package com.example.social_network;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Calendar;
import java.util.Date;

@Data
public class Account {
    private String id;

    @NotBlank(message = "firstName should be valid!")
    private String firstName;

    @NotBlank(message = "lastName should be valid!")
    private String lastName;

    @Email(message = "Email should be valid!")
    private String email;

    @Size(min = 5, max = 20,
            message = "Password must be between 5 and 20 characters!")
    private String password;

    private Date dateRegistration = Calendar.getInstance().getTime();

}
