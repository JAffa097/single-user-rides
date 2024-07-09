package com.okcrides.single_user_rides.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userManager(){
        UserDetails user= User.builder()
                .username("user")
                .password("{noop}password")
                .roles("Employee")
                .build();
        return new InMemoryUserDetailsManager(user);
    }
}
