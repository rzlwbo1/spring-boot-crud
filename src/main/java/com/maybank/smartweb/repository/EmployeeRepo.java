package com.maybank.smartweb.repository;

import com.maybank.smartweb.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
