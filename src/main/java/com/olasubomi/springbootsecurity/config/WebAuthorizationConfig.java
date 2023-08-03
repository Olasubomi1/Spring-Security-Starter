package com.olasubomi.springbootsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class WebAuthorizationConfig {
    //help configure endpoints authorization with default behavior
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests((authz) ->
                        authz.anyRequest()
                                //.authenticated()
                                // we can make all the endpoints accessible without the need for credentials.
                                .permitAll())
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }
}
