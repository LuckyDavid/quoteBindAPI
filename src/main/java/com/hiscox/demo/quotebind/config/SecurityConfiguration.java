package com.hiscox.demo.quotebind.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
			.withUser("admin").password(passwordEncoder().encode("password1")).roles("ADMIN").authorities("ACCESS_LEVEL1", "API")
			.and()
			.withUser("manager").password(passwordEncoder().encode("password1")).roles("MANAGER").authorities("ACCESS_LEVEL1");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.antMatchers("/product/list").hasAuthority("API")
			.antMatchers("/h2-console").hasAuthority("ACCESS_LEVEL1")
			.and()
			.httpBasic();
		
		/* Temporary workaround to get access to H2 test db */
		http.csrf().disable();
		http.headers().frameOptions().disable();
	}
	
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
