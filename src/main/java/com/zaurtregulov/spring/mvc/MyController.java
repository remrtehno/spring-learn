package com.zaurtregulov.spring.mvc;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "firstView";
    }

    @RequestMapping("ask-employee-details")
    public String askEmployeeDetails() {
        return "ask-employee-details";
    }

//    @RequestMapping("show-employee-details")
//    public String showEmployeeDetails() {
//        return "show-employee-details";
//    }


    @RequestMapping("show-employee-details")
    public String showEmployeeDetails(@RequestParam("employeeName") String name, Model model) {
        name = "Mr." + name;
        model.addAttribute("nameAttribute", name);


        return "show-employee-details";
    }
}
