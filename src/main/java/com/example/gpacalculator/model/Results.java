package com.example.gpacalculator.model;

public class Results {

    private double semesterGPA;

    private double GPA;

    public Results() {
        this.semesterGPA = 0;
        this.GPA = 0;
    }

    public double getSemesterGPA() {
        return semesterGPA;
    }

    public void setSemesterGPA(double semesterGPA) {
        this.semesterGPA = semesterGPA;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
