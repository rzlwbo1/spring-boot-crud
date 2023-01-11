package com.maybank.smartweb.service;

import com.maybank.smartweb.entity.Employee;
import com.maybank.smartweb.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAll() {
        return this.employeeRepo.findAll();
    }

    @Override
    public Page<Employee> getAllPaginate(int pageNo, int pageSize, String field) {

        PageRequest paging = PageRequest.of(pageNo, pageSize, Sort.by(field).ascending());

        return this.employeeRepo.findAll(paging);
    }

    @Override
    public void save(Employee employee) {
        this.employeeRepo.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        this.employeeRepo.delete(employee);
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return this.employeeRepo.findById(id);
    }


}
