package com.example.gpacalculator.service;

import com.example.gpacalculator.model.Course;
import com.example.gpacalculator.model.Results;
import com.example.gpacalculator.model.User;

import java.util.List;

public interface ICalculationService {

    public Results calculate(User user, List<Course> courses);

}
