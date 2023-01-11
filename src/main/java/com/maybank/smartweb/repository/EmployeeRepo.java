package com.maybank.smartweb.repository;

import com.maybank.smartweb.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    @Query("SELECT firstName FROM Employee WHERE firstName LIKE :q%")
    List<Employee> searchEmployees(@Param("q") String query);
}
