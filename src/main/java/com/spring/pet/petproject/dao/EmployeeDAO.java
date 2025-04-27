package com.spring.pet.petproject.dao;



import com.spring.pet.petproject.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);
    public Employee getEmployeeById(int id);

    public void deleteEmployee(int id);
}
