package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.entity.Users;
import com.model.CustomUserDetailsService;

@Configuration
@ComponentScan(basePackages = "com") // Make sure to scan the package containing Users and CustomUserDetail
@EnableJpaRepositories(basePackages = "com.dao") // If you're using JPA repositories
public class AppSecurityConfig {
	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
	
//	@Autowired
//	UserDetailsService userDetailsService;
	
	
	

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public UserDetailsService userDetailsService() {		
		return new CustomUserDetailsService();
		
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider dap =  new DaoAuthenticationProvider();
		dap.setPasswordEncoder(passwordEncoder());
		dap.setUserDetailsService(userDetailsService());
		return dap;
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		return httpSecurity.csrf().disable()
		.authorizeHttpRequests()
		.requestMatchers("/employee","/users/add").permitAll()
		.and()
		.authorizeHttpRequests().requestMatchers("/employee/**").authenticated().and()
		.httpBasic().and().build();
	}

}
