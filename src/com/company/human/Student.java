package com.company.human;

public class Student {

    private String studentName;
    private String studentLN;

    public Student(String name, String studentLN) {
        this.studentName = name;
        this.studentLN = studentLN;
    }

    @Override
    public String toString() {
        return studentName + " " + studentLN + "\n";
    }
}
