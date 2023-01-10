package com.maybank.smartweb.controller;

import com.maybank.smartweb.entity.Employee;
import com.maybank.smartweb.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String index(Model model) {

        String springMessage = "Hello view ini dari model";
        model.addAttribute("springMessage", springMessage);
        return "Home";
    }

    @GetMapping("/car")
    public String carPage() {
        return "car";
    }

}
