package com.maybank.smartweb.repository;

import com.maybank.smartweb.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    @Query("select first_name from employee where first_name like 'q%'")
    List<Employee> searchEmployees(String query);
}
