package com.maybank.smartweb.config;

import com.maybank.smartweb.service.CustomerUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MyAuth {

    @Autowired
    private CustomerUserDetailService customerUserDetailService;

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(customerUserDetailService);
        authProvider.setPasswordEncoder(bCryptPasswordEncoder());
        return authProvider;
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests().antMatchers("/employee").hasAnyAuthority("Regular");
        httpSecurity.authorizeRequests().antMatchers("/car").hasAnyAuthority("Admin");
        httpSecurity.authorizeRequests().antMatchers("/api/*").anonymous();
        httpSecurity.authorizeRequests().anyRequest().authenticated();
        httpSecurity.authorizeRequests().and().formLogin();

        return httpSecurity.build();
    }

    // ini digunakan saat deploy dan gabisa nambah user

//    @Bean
//    public UserDetailsService userDetailsService(BCryptPasswordEncoder bCryptPasswordEncoder) {
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withUsername("abc")
//                .password(bCryptPasswordEncoder.encode("1234"))
//                .roles("regular").build());
//
//        manager.createUser(User.withUsername("admin")
//                .password(bCryptPasswordEncoder.encode("1234"))
//                .roles("admin").build());
//        return manager;
//    }

}
