package com.maybank.smartweb.service;

import com.maybank.smartweb.entity.RoleRepo;
import com.maybank.smartweb.entity.User;
import com.maybank.smartweb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RoleRepo roleRepo;

    public User findUserByUsername(String username) {
        return this.userRepo.findByUsername(username);
    }

}
