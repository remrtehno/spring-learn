package com.zaurtregulov.spring.security.configuration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getInfoForAllEmployees(Model model) {
        return "all-employees";
    }

    @GetMapping("/hr")
    public String showHrDashboard() {
        return "hr-dashboard"; // Return the JSP view for HRs
    }

    @GetMapping("/manager")
    public String showManagerDashboard() {
        return "manager-dashboard"; // Return the JSP view for Managers
    }
}
