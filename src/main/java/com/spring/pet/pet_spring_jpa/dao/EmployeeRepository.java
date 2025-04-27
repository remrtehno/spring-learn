package com.spring.pet.pet_spring_jpa.dao;

import com.spring.pet.pet_spring_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // all default methods findAll, findById, save, deleteById
    // if we need to find by custom field, or by name
    List<Employee> findAllByName(String name);
    List<Employee> findAllBySalaryGreaterThanEqual(double salary);

    public List<Employee> findAllBySalary(double salary);
    public List<Employee> findAllBySalaryGreaterThan(double salary);
    public List<Employee> findAllBySalaryLessThan(double salary);
    public List<Employee> findAllBySalaryBetween(double salary1, double salary2);
    public List<Employee> findAllBySalaryEquals(double salary);


    List<Employee> findBySalaryBetweenAndDepartment(int salaryAfter, int salaryBefore, String department);
    
    public List<Employee> findByDepartment(String department);
}
