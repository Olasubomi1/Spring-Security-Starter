package com.olasubomi.springbootsecurity.Users;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
   This class uses the SecurityUser class only to map the user details in the
   system to the UserDetails contract understood by Spring Security.
   To mark the fact that the SecurityUser makes no sense without a User entity,
   we make the field final.
   You have to provide the user through the constructor. The SecurityUser class deco-rates
   the User entity class and adds the needed code related to the Spring Security con-tract
   without mixing the code into a JPA entity, thereby implementing multiple different tasks.
 */

public class SecurityUser implements UserDetails {
    private User user;


    public SecurityUser(User user) {
        this.user = user;
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(()-> user.getAuthority());
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
