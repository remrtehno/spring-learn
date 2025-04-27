package com.spring.pet.pet_spring_jpa.service;


import com.spring.pet.pet_spring_jpa.dao.EmployeeRepository;
import com.spring.pet.pet_spring_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        Employee employee = null;
        Optional<Employee> optional = employeeRepository.findById(id);
        if(optional.isPresent()) {
            employee = optional.get();
        }

        return employee;
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        return employeeRepository.findAllByName(name);
    }
}
