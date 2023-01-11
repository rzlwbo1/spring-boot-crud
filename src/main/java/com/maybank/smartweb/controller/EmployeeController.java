package com.maybank.smartweb.controller;

import com.maybank.smartweb.entity.Employee;
import com.maybank.smartweb.repository.EmployeeRepo;
import com.maybank.smartweb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String index(
            @RequestParam(value = "pageNo", defaultValue = "0") int pageNo,
            @RequestParam(value = "pageSize", defaultValue = "5") int pageSize,
            @RequestParam(value = "sortField", defaultValue = "id") String sortField,
            @RequestParam(value = "keyword", defaultValue = "all") String q,
            Model model) {


        // default nya all
        if (!q.equals("all")) {
            System.out.println(q);
        } else {
            // get all datas employee by service
            Page<Employee> employees = this.employeeService.getAllPaginate(pageNo, pageSize, sortField);
            model.addAttribute("page", employees);
        }

        String springMessage = "Hello view ini Employee";

        model.addAttribute("springMessage", springMessage);
        model.addAttribute("employeeForm", new Employee());

//        System.out.println(data);
        return "employee";
    }


    // handle save data dan edit data
    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("employeeForm") Employee employeeForm,
                       BindingResult result,
                       RedirectAttributes attributes,
                       @RequestParam(value = "pageNo", defaultValue = "0") int pageNo,
                       @RequestParam(value = "pageSize", defaultValue = "5") int pageSize,
                       @RequestParam(value = "sortField", defaultValue = "id") String sortField,
                       Model model) {

        // kalo ada error dari inputan
        if (result.hasErrors()) {

            Page<Employee> employees = this.employeeService.getAllPaginate(pageNo, pageSize, sortField);
            model.addAttribute("page", employees);

            return "employee";
        }

        // save data by service
        this.employeeService.save(employeeForm);
        attributes.addFlashAttribute("success", "Berhasil insert");
        return "redirect:/employee";
    }


    // handle form edit
    @GetMapping("/edit")
    public String edit(@RequestParam("id") Long id, Model model) {

        Optional<Employee> employee = this.employeeService.getEmployeeById(id);
        model.addAttribute("employeeForm", employee);

        return "edit-employee";
    }



    @GetMapping("/delete")
    public String delete(@RequestParam("id") Long id, RedirectAttributes attributes) {
        Optional<Employee> employee = this.employeeService.getEmployeeById(id);
        if (employee.isPresent()) {
            this.employeeService.delete(employee.get());
        }
        attributes.addFlashAttribute("success", "Berhasil di delete");
        return "redirect:/employee";
    }
}
