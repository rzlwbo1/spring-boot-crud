package com.maybank.smartweb.service;

import com.maybank.smartweb.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public List<Employee> getAll();
    public void save(Employee employee);
    public void delete(Employee employee);
    public Optional<Employee> getEmployeeById(Long id);

}
