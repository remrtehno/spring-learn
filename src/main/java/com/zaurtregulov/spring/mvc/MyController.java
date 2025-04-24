package com.zaurtregulov.spring.mvc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "firstView";
    }

    @RequestMapping("ask-employee-details")
    public String askEmployeeDetails() {
        return "ask-employee-details";
    }

    @RequestMapping("show-employee-details")
    public String showEmployeeDetails() {
        return "show-employee-details";
    }
}
