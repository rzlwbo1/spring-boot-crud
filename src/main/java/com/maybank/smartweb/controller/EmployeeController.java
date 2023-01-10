package com.maybank.smartweb.controller;

import com.maybank.smartweb.entity.Employee;
import com.maybank.smartweb.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping
    public String index(Model model) {

        // get all datas employee
        List<Employee> employees = this.employeeRepo.findAll();

        String springMessage = "Hello view ini Employee";

        model.addAttribute("employees", employees);
        model.addAttribute("springMessage", springMessage);
        model.addAttribute("employeeForm", new Employee());

        System.out.println(employees);
        return "employee";
    }

    @PostMapping("/save")
    public String save(Employee employee) {
        this.employeeRepo.save(employee);
        return "redirect:/employee";
    }
}
