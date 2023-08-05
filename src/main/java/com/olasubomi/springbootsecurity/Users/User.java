package com.olasubomi.springbootsecurity.Users;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

//This is a user entity class that uses the spring boot data JPA
@Entity
@Data
public class User {
    @Id
    private int id;
    private String username;
    private String password;
    private String authority;
    // Omitted getters and setters
}
