package com.maybank.smartweb.service;

import com.maybank.smartweb.entity.Role;
import com.maybank.smartweb.entity.RoleRepo;
import com.maybank.smartweb.entity.User;
import com.maybank.smartweb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class InitDefaultUserAuth {

    @Autowired
    private RoleRepo roleRepo;

    @Autowired
    private UserRepo userRepo;

//    @PostConstruct
//    public void index() {
//
//        // create role
//        Role roleReguler = new Role();
//        Role roleAdmin = new Role();
//
//        roleReguler.setRole("Regular");
//        roleAdmin.setRole("Admin");
//        this.roleRepo.save(roleReguler);
//        this.roleRepo.save(roleAdmin);
//
//
//        // create user dan buat list role
//        List<Role> roleList = new ArrayList<>();
//        roleList.add(roleAdmin);
//        roleList.add(roleReguler);
//
//        List<Role> userRoleList = new ArrayList<>();
//        userRoleList.add(roleReguler);
//
//
//        User userAdmin = new User();
//        userAdmin.setUsername("maybank");
//        userAdmin.setEmail("maybank@maybank.com");
//        userAdmin.setPassword(new BCryptPasswordEncoder().encode("12345678"));
//        userAdmin.setRoles(roleList);
//
//        User userRegular = new User();
//        userRegular.setUsername("user");
//        userRegular.setEmail("user@maybank.com");
//        userRegular.setPassword(new BCryptPasswordEncoder().encode("12345678"));
//        userRegular.setRoles(userRoleList);
//
//        this.userRepo.save(userAdmin);
//        this.userRepo.save(userRegular);
//
//    }

}
