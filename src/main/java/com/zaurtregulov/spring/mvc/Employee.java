package com.zaurtregulov.spring.mvc;

import jakarta.validation.constraints.Size;

public class Employee {
    @Size(min = 2, max = 50, message = "must be min 2 chars")
    private String employeeName;


    public Employee() {

    }

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
