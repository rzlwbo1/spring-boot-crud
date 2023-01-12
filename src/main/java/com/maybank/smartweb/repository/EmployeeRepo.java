package com.maybank.smartweb.repository;

import com.maybank.smartweb.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    @Query(value = "SELECT * FROM employee WHERE first_name LIKE %:keyword% OR last_name LIKE %:keyword%", nativeQuery = true)
    Page<Employee> findEmployeesByKeyword(Pageable pageable, @Param("keyword") String keyword);
}
