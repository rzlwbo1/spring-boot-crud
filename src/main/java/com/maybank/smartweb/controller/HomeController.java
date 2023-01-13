package com.maybank.smartweb.controller;

import com.maybank.smartweb.entity.*;
import com.maybank.smartweb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RoleRepo roleRepo;

    @GetMapping
    public String index(Model model) {

        String springMessage = "Hello view ini dari model";
        model.addAttribute("springMessage", springMessage);
        return "Home";
    }

    @GetMapping("/regis")
    public String regis(Model model) {
        model.addAttribute("userForm", new User());
        return "register";
    }

    @PostMapping("/regis/save")
    public String saveUser(@Valid @ModelAttribute("userForm") User userForm,
                           BindingResult result,
                           Model model) {



        // create user dan buat list role
//        List<Role> roleList = new ArrayList<>();
//        roleList.add(roleAdmin);
//        roleList.add(roleReguler);
//
//        List<Role> userRoleList = new ArrayList<>();
//        userRoleList.add(roleReguler);



        if (userForm.getRoles().equals("Reguler") ) {

            List<Role> roles = this.roleRepo.findById(Long.valueOf(1)).stream().toList();

            User user = new User();
            user.setUsername(userForm.getUsername());
            user.setEmail(userForm.getEmail());
            user.setPassword(new BCryptPasswordEncoder().encode(userForm.getPassword()));
            user.setRoles(roles);

            System.out.println(user);
        }


//        this.userRepo.save(user);

        return "redirect:/register";
    }


}
