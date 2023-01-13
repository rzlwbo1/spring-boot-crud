package com.maybank.smartweb.dataapi;

import com.maybank.smartweb.entity.Employee;
import com.maybank.smartweb.entity.User;
import com.maybank.smartweb.service.EmployeeService;
import com.maybank.smartweb.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8081")
public class UserApi {

    @Autowired
    private LoginService loginService;
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/user")
    public List<User> userIndex() {
        return this.loginService.findAll();
    }

    @PostMapping("/user/save")
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@RequestBody User user) {
//        this.loginService.addUser(user);
        return user;
    }


}