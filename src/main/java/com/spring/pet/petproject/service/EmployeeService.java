package com.spring.pet.petproject.service;



import com.spring.pet.petproject.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployeeById(int id);

    public void deleteEmployee(int id);
}
