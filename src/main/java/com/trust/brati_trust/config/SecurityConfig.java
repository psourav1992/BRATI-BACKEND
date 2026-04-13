package com.trust.brati_trust.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/admin/**").authenticated()
                        // protect only /admin
                        .anyRequest().permitAll()
                )
                .httpBasic(Customizer.withDefaults()) // modern way to enable basic auth
                .csrf(csrf -> csrf.disable()); // disable CSRF for simplicity

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails admin = User.withUsername("admin")
                .password("{noop}password") // {noop} means plain text password
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(admin);
    }
}

