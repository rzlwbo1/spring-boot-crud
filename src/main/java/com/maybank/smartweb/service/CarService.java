package com.maybank.smartweb.service;

import com.maybank.smartweb.entity.Car;
import com.maybank.smartweb.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface CarService {

    public List<Car> getAll();
    public void save(Car car);
    public void delete(Car car);
    public Optional<Car> getCarById(Long id);

}
