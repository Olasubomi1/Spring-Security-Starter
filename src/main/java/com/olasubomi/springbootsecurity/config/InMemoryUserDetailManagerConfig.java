package com.olasubomi.springbootsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

public class InMemoryUserDetailManagerConfig {
    @Autowired
    private UserManagementConfig userService;
    //configuring in-memory user details
    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        return new InMemoryUserDetailsManager(userService.userDetailsService());
    }
}
