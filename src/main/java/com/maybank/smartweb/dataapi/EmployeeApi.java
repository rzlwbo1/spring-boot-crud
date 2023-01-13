package com.maybank.smartweb.dataapi;

import com.maybank.smartweb.entity.Employee;
import com.maybank.smartweb.entity.User;
import com.maybank.smartweb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeApi {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/user")
    public User userIndex() {
        return new User();
    }

    @GetMapping("/employee")
    public List<Employee> index() {
        return this.employeeService.getAll();
    }

}
