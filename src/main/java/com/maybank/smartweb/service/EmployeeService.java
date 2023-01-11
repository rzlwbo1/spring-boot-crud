package com.maybank.smartweb.service;

import com.maybank.smartweb.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public List<Employee> getAll();
    public Page<Employee> getAllPaginate(int pageNo, int pageSize, String field);
    public void save(Employee employee);
    public void delete(Employee employee);
    public Optional<Employee> getEmployeeById(Long id);
    List<Employee> searchEmployees(String query);


}
