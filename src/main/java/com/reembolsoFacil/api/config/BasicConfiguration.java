package com.reembolsoFacil.api.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.fasterxml.jackson.core.filter.TokenFilter;

@Configuration("http.csrf.disable")
@EnableWebSecurity
public class BasicConfiguration extends WebSecurityConfigurerAdapter {
 
	@Override
    protected void configure(HttpSecurity security) throws Exception
    {
		security.authorizeRequests()
	    .anyRequest().authenticated()
	    .and().cors()
	    .and().csrf().disable();
		
		
		

    }
	
}
