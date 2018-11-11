package com.project.accounting.context;


import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.project.accounting.repository.AppUserRepository;

import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@EnableJpaRepositories(basePackageClasses= AppUserRepository.class)
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {


	@Autowired
	DataSource dataSourcee;

	@Autowired
	ObjectMapper objectMapper;


@Resource
    private UserDetailsService userDetailsService;


    @Override

    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable().authorizeRequests()
                .antMatchers("/admin/**").hasRole("ADMIN")
				.antMatchers("/registration").permitAll()
				.antMatchers("/user/save").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/chartofaccount").permitAll()
                .antMatchers("/ca/**").permitAll()
                .anyRequest().permitAll()
				.and().formLogin()
				.loginPage("/login")
				.loginProcessingUrl("/perform_login")
				.defaultSuccessUrl("/user/temp", true)
				.failureUrl("/user/authfailur")
				.failureHandler(authenticationFailureHandler())
				.and()
				.logout()
				.logoutUrl("/perform_logout")
				.deleteCookies("JSESSIONID")
				.logoutSuccessHandler(logoutSuccessHandler());

//        http.authorizeRequests().anyRequest().
//                authenticated().and().formLogin().
//                loginPage("/login").permitAll();
//        System.out.println("Security accessed");
//        http.csrf().requireCsrfProtectionMatcher(new AntPathRequestMatcher("**/login"))
//                .and().authorizeRequests().antMatchers("/home").hasRole("USER")
//                .and().authorizeRequests().antMatchers("/home1").hasRole("USER")
//                .and().authorizeRequests().antMatchers("/index").hasRole("USER")
//                .and().authorizeRequests().antMatchers("/userregistration").hasAnyRole("USER","ADMIN")
//                .and().authorizeRequests().antMatchers("/user/save").permitAll()
//                .and().authorizeRequests().antMatchers("/showAllUser").authenticated()
//                .and().authorizeRequests().antMatchers("/showUserByName").authenticated()
//                .and().formLogin().defaultSuccessUrl("/home").loginPage("/login").permitAll()
//                .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login");



    }

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("khan").password("{noop}123456").roles("USER");
//    }

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSourcee)
				.usersByUsernameQuery(
						"select username,password, enabled from users where username=?")
				.authoritiesByUsernameQuery(
						"select user_name, role_name from authorities where user_name=?")
				.passwordEncoder(passwordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder(){

        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationFailureHandler authenticationFailureHandler() throws Exception {
        return (request, response, exception) -> {

			response.setStatus(HttpStatus.UNAUTHORIZED.value());
			Map<String, Object> data = new HashMap<>();
			data.put("timestamp",
					Calendar.getInstance().getTime());
			data.put(
					"exception",
					exception.getMessage());
			response.getOutputStream()
					.println(objectMapper.writeValueAsString(data));
		};
    }

@Bean
public LogoutSuccessHandler logoutSuccessHandler() throws Exception {
	return (request, response, authentication) -> {
		if(authentication != null) {
			System.out.println(authentication.getName());
		}
		//perform other required operation
		String URL = request.getContextPath() + "/app";
		response.setStatus(HttpStatus.OK.value());
		response.sendRedirect(URL);
	};
}

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/*.css");
        web.ignoring().antMatchers("/report/**");
        web.ignoring().antMatchers("/*.js");
        web.ignoring().antMatchers("/lib/bootstrap/**");
        web.ignoring().antMatchers("/views/**");
    }
}
