package com.okcrides.single_user_rides.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class LoginPageSecurityConfig {

    @Bean
    public SecurityFilterChain loginSecurity(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(configurer->
                      configurer
                              .requestMatchers("/css/**", "/js/**", "/images/**")
                              .permitAll()
                              .anyRequest()
                              .authenticated()
                      )
                      .formLogin(form->
                              form
                                      .loginPage("/loginpage")
                                      .loginProcessingUrl("/authenticateUser")
                                      .permitAll()).logout(LogoutConfigurer::permitAll);

    return http.build();
    }
}
