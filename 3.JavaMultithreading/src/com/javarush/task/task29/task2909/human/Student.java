package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Student extends UniversityPerson {

    private int course;
    private double averageGrade;
    private Date beginningOfSession;
    private Date endOfSession;

    public Student(String name, int age, double averageGrade) {
        super(name,age);
        this.averageGrade = averageGrade;
    }


    public void live() {
        learn();
    }

    public void learn() {
    }

    @Override
    public String getPosition() {
        return "Студент";
    }

    public int getCourse() {
        return course;
    }
    public void setCourse(int course){
        this.course = course;}

  /*  public void incAverageGradeBy01() {
        averageGrade += 0.1;
    }

    public void incAverageGradeBy02() {
        averageGrade += 0.2;
    }
*/
    public void incAverageGrade(double delta){
        averageGrade+=delta;
        setAverageGrade(getAverageGrade());

    }

    /*public void setValue(String name, double value) {
        if (name.equals("averageGrade")) {
            averageGrade = value;
            return;
        }
        if (name.equals("course")) {
            course = (int) value;
            return;
        }
    }*/

    public void setBeginningOfSession(Date date) {
        this.beginningOfSession = date;
    }

    public void setEndOfSession(Date date) {
        this.endOfSession = date;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}