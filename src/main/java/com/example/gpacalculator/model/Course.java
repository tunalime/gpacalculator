package com.example.gpacalculator.model;

public class Course {

    private String courseName;

    private double credit;

    private double grade;

    private boolean isRepeat;

    private double preGrade;

    public Course(){
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean isRepeat() {
        return isRepeat;
    }

    public void setRepeat(boolean repeat) {
        isRepeat = repeat;
    }

    public double getPreGrade() {
        return preGrade;
    }

    public void setPreGrade(double preGrade) {
        this.preGrade = preGrade;
    }
}
