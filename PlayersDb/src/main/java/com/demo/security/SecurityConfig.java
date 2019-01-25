package com.demo.security;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableConfigurationProperties
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
    protected void configure(AuthenticationManagerBuilder auth) 
      throws Exception {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        auth.inMemoryAuthentication()
          .withUser("cricbuzz")
          .password(encoder.encode("player"))
          .roles("USER");
        
	}
	 @Override 
	 protected void configure(HttpSecurity httpSecurity) throws Exception {
	 
	 httpSecurity 
	 .authorizeRequests() 
	 .anyRequest().fullyAuthenticated() 
	 //.permitAll()
	 .and()
	 .httpBasic();
	 httpSecurity.csrf().disable(); 
	 }
}
