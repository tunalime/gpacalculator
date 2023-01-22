package com.example.gpacalculator.controller;

import com.example.gpacalculator.model.Course;
import com.example.gpacalculator.model.Results;
import com.example.gpacalculator.model.User;
import com.example.gpacalculator.service.impl.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CalculateController {
    @Autowired
    private CalculationService calculationService;

    @GetMapping("/")
    public String showCalculatorForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("course", new Course());
        return "calculatorForm1";
    }

    @PostMapping("/calculate")
    public String calculate(@ModelAttribute User user, @ModelAttribute Course course, Model model) {
        List<Course> courses = new ArrayList<>();
        courses.add(course);
        Results results = calculationService.calculate(user, courses);
        model.addAttribute("results", results);
        return "results";
    }
}