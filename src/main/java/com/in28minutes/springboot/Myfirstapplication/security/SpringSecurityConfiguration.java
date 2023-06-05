package com.in28minutes.springboot.Myfirstapplication.security;
import org.springframework.security.core.userdetails.User;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
	//lDAP or Database 
	//In Memory 
	
//	InMemoryUserDetailsManager
//	inMemoryUserDetailsManager(UserDetails... users)
	
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		Function<String, String> passwordEncoder
			= input -> passwordEncoder().encode(input);
		UserDetails userDetails=User.builder()
			.passwordEncoder(passwordEncoder)	
			.username("test")
			.password("test")
			.roles("USER", "ADMIN")
			.build();
		return new InMemoryUserDetailsManager(userDetails);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
}
