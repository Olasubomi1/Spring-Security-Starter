package com.olasubomi.springbootsecurity.config;

//import com.olasubomi.springbootsecurity.Service.InMemoryUserDetailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;
import java.util.List;

@Configuration
public class AppConfig {
//    @Bean
//    public UserDetailsService userDetailsService(){
//        UserDetails u = new UserManagementConfig().userDetailService();
//        List<UserDetails> users = List.of(u);
//        return new InMemoryUserDetailService(users);
//    }
//    @Bean
//    public UserDetailsService userDetailsJDBCService(DataSource dataSource) {
//        return new JdbcUserDetailsManager(dataSource);
//    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
