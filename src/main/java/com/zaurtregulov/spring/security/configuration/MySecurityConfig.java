package com.zaurtregulov.spring.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MySecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

        UserDetails user = User.withUsername("user")
                .password(encoder.encode("user"))
                .roles("EMPLOYEE")
                .build();

        UserDetails hr = User.withUsername("hr")
                .password(encoder.encode("user"))
                .roles("HR")
                .build();

        UserDetails admin = User.withUsername("admin")
                .password(encoder.encode("admin"))
                .roles("MANAGER")
                .build();

        return new InMemoryUserDetailsManager(user, admin, hr);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/").hasAnyRole("EMPLOYEE", "HR", "MANAGER")
                                .requestMatchers("/admin/**").hasRole("ADMIN")
                                .requestMatchers("/hr/**").hasRole("HR")
                                .requestMatchers("/employee").hasRole("EMPLOYEE")
                                .requestMatchers("/manager").hasRole("MANAGER")
                                .anyRequest().authenticated()
                )
                .formLogin(formLogin ->
                        formLogin
                                .permitAll()
                );

        return http.build();
    }
}