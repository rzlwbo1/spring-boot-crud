package com.maybank.smartweb.service;

import com.maybank.smartweb.entity.Car;
import com.maybank.smartweb.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepo carRepo;

    @Override
    public List<Car> getAll() {
        return this.carRepo.findAll();
    }

    @Override
    public void save(Car car) {
        this.carRepo.save(car);
    }

    @Override
    public void delete(Car car) {
        this.carRepo.delete(car);
    }

    @Override
    public Optional<Car> getCarById(Long id) {
        return this.carRepo.findById(id);
    }
}
