package com.javarush.task.task29.task2909.human;

/**
 * Created by User on 27.08.2020.
 */
public class UniversityPerson extends Human {
    private University university;
    public UniversityPerson(String name, int age) {
        super(name, age);
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
