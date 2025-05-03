package com.bditw.myCoolestApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails john = User.builder()
                .username("john")
                .password("{noop}john")  // {noop} means plain text (no encoding)
                .roles("WORK")
                .build();

        UserDetails mary = User.builder()
                .username("mary")
                .password("{noop}mary")
                .roles("ADMIN")
                .build();

        UserDetails tracy = User.builder()
                .username("tracy")
                .password("{noop}tracy")
                .roles("MANAGER")
                .build();

        return new InMemoryUserDetailsManager(john, mary, tracy);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                        configurer
                                .requestMatchers(HttpMethod.GET, "/employees").hasRole("WORK")
                                .requestMatchers(HttpMethod.GET, "/employees/**").hasRole("WORK")
                                .requestMatchers(HttpMethod.POST, "/employees").hasRole("MANAGER")
                                .requestMatchers(HttpMethod.PUT, "/employees").hasRole("MANAGER")
                                .requestMatchers(HttpMethod.DELETE, "/employees/**").hasRole("ADMIN")
                )
                .httpBasic(Customizer.withDefaults())
                .csrf(csrf -> csrf.disable());

        return http.build();
    }
}