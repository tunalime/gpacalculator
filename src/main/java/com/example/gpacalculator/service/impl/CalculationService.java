package com.example.gpacalculator.service.impl;

import com.example.gpacalculator.model.Course;
import com.example.gpacalculator.model.Results;
import com.example.gpacalculator.model.User;
import com.example.gpacalculator.service.ICalculationService;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class CalculationService implements ICalculationService {


    @Override
    public Results calculate(User user, List<Course> courses) {

        Results results = new Results();

        double totalCredits = user.getTotalCredits();
        double gpa = user.getGpa();
        double totalScore = totalCredits * gpa;
        double semesterCredits = 0;
        double semesterScore = 0;

        Iterator<Course> itr = courses.iterator();

        while(itr.hasNext()){
            Course course = itr.next();
            if(!course.isRepeat()){
                totalCredits += course.getCredit();
            } else{
                totalScore -= course.getPreGrade() * course.getCredit();
            }
            totalScore += course.getCredit() * course.getGrade();
            semesterCredits += course.getCredit();
            semesterScore += course.getCredit() * course.getGrade();
        }

        results.setSemesterGPA(semesterScore / semesterCredits);
        results.setGPA(totalScore / totalCredits);

        return results;
    }
}
