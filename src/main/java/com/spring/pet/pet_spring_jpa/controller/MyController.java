package com.spring.pet.pet_spring_jpa.controller;


import com.spring.pet.pet_spring_jpa.entity.Employee;
import com.spring.pet.pet_spring_jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class MyController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return employees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable("id") int id) {
        Employee employee = employeeService.getEmployeeById(id);



        return employee;
    }


    // put a new employee
    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }
    // update an employee by {}
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        Employee employee = employeeService.getEmployeeById(id);


        employeeService.deleteEmployee(id);
        return "Employee with id " + id + " was deleted!!!!";
    }

    @GetMapping("/employees/name/{name}")
    public List<Employee> getEmployeeByName(@PathVariable("name") String name) {
        List<Employee> employees = employeeService.getEmployeeByName(name);
        return employees;
    }
}
