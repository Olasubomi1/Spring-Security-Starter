package com.olasubomi.springbootsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserManagementConfig {
    //Used to creating user for authorization
//    @Bean
//    public UserDetails userDetailService(){
//        var userDetails = User.withUsername("soft")
//                .password("12345")
//                .authorities("USER")
//                .build();
//        return userDetails;
//    }
    //Used for managing user password
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }
}

