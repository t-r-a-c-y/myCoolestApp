package com.bditw.myCoolestApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.server.session.InMemoryWebSessionStore;

@Configuration
public class DemoConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails john = User.builder().username("john").password("john").roles("WORK").build();
        UserDetails mary = User.builder().username("mary").password("mary").roles("ADMIN").build();
        UserDetails tracy= User.builder().username("tracy").password("tracy").roles("MANAGER").build();
        return new InMemoryUserDetailsManager(john, mary, tracy);
    }
}
