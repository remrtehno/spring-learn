package com.zaurtregulov.spring.mvc;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "firstView";
    }

    @RequestMapping("ask-employee-details")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());

        return "ask-employee-details";
    }

    @RequestMapping("show-employee-details")
    public String showEmployeeDetails(@Valid  @ModelAttribute("employee") Employee employee,
                                      BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-employee-details"; // go back to the form page
        }

        return "show-employee-details";
    }
}
