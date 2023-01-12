package com.maybank.smartweb.controller;

import com.maybank.smartweb.entity.Car;
import com.maybank.smartweb.repository.CarRepo;
import com.maybank.smartweb.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/car")
public class CarContoller {

    @Autowired
    private CarService carService;


    @GetMapping
    public String index(Model model) {

        List<Car> cars = this.carService.getAll();

        model.addAttribute("cars", cars);
        model.addAttribute("msg", "Cars Data");
        model.addAttribute("carForm", new Car());

        System.out.println(cars);
        return "car";
    }

    @PostMapping("/save")
    public String save(Car car, RedirectAttributes attributes) {

        this.carService.save(car);
        attributes.addFlashAttribute("success", "Data berhasil dimasukan");
        return "redirect:/car";

    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Long id, RedirectAttributes attributes) {
        Optional<Car> car = this.carService.getCarById(id);

        if (car.isPresent()) {
            this.carService.delete(car.get());
            attributes.addFlashAttribute("success", "Data berhasil dihapus");
        }

        return "redirect:/car";
    }
}
