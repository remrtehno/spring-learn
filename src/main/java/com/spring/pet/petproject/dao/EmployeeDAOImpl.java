package com.spring.pet.petproject.dao;


import com.spring.pet.petproject.entity.Employee;
import jakarta.persistence.EntityManager;

import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {
        Query query = entityManager.createQuery("from Employee");
        List<Employee> employees = query.getResultList();

        return employees;
    }

    @Override
    public void saveEmployee(Employee employee) {
            Employee employee1 = entityManager.merge(employee);
            employee.setId(employee1.getId()); //because ID = 0 when creates a new employee
    }

    @Override
    public Employee getEmployeeById(int id) {
        Employee employee = entityManager.find(Employee.class, id);

        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        Query query = entityManager.createQuery("delete from Employee where id=:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
