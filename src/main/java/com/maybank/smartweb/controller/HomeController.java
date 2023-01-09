package com.maybank.smartweb.controller;

import com.maybank.smartweb.entity.Car;
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
    public String carPage(Model model) {

        Car car = new Car();
        car.setPabrikan("Honda");
        car.setPrice(1000.00);
        car.setType("Matic");
        car.setColor("Blue");

        model.addAttribute("car", car);
        model.addAttribute("msg", "Ini data car");
        System.out.println(car.toString());
        return "car";
    }

}
