package com.maybank.smartweb.controller;

import com.maybank.smartweb.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String index(Model model) {

        Employee employee = new Employee();
        employee.setFirstName("Rizal");
        employee.setLastName("Wibowo");
        employee.setContact("1902312");
        employee.setAddress("Bumles");

        String springMessage = "Hello view ini dari model";
        model.addAttribute("employee", employee);
        model.addAttribute("springMessage", springMessage);
        return "Home";
    }

    @GetMapping("/car")
    public String carPage() {
        return "car";
    }

}
