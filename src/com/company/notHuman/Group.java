package com.company.notHuman;

import com.company.human.Student;

import java.util.Arrays;

public class Group {

    private String name;
    private Student[] students;

    public Group(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

//    @Override
//    public String toString() {
//        return  Arrays.toString(students).replace("[", "")
//                .replace("]", "").replace(",", "");
//    }
}
