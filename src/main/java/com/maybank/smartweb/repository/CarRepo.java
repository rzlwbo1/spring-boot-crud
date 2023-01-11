package com.maybank.smartweb.repository;

import com.maybank.smartweb.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long> {
}
