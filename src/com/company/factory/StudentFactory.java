package com.company.factory;

import com.company.human.Student;


public class StudentFactory {

    private String[] studentNames = new String[]{"Дима", "Игорь", "Вова", "Даша", "Egor", "Петя"};
    private String[] studentLN = new String[]{"Igorevich", "Rudenko", "Lapenko"};

    public Student createStudent()
    {
        return new Student(randomString(studentNames),randomString(studentLN));
    }

    private String randomString(String[]studentNames)
    {
        int n = (int)Math.floor(Math.random() * studentNames.length);
        return  studentNames[n];
    }

}
