package com.maybank.smartweb.repository;

import com.maybank.smartweb.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    @Query("SELECT firstName FROM Employee WHERE firstName LIKE ':q' ")
    Page<Employee> searchEmployees(Pageable pageable, @Param("q") String query);
}
