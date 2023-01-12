package com.maybank.smartweb.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerUserDetailService implements UserDetailsService {

    // kalo auth disini akan buat usernya ketika ada request

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // cara baca
        // si admin user nya admdin dan pw nya 1234 , dan roles nya regular dan admin

        List<GrantedAuthority> auths = new ArrayList<>();
        auths.add(new SimpleGrantedAuthority("regular")); // roles
        auths.add(new SimpleGrantedAuthority("admin"));

        // akun admin
        UserDetails user = User.withUsername("admin")
                .password(new BCryptPasswordEncoder().encode("1234"))
                .authorities(auths)
                .build();

        return user;
    }
}
