package com.spring.pet.pet_spring_jpa.service;


import com.spring.pet.pet_spring_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployeeById(Integer id);

    public void deleteEmployee(Integer id);

    public List<Employee> getEmployeeByName(String name);
}
