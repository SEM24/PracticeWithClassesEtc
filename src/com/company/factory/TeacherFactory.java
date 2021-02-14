package com.company.factory;

import com.company.human.Teacher;

public class TeacherFactory {

    private final String[] teacherNames = new String[]{"Ольга", "Анна", "Татьяна","Людмила","Тамара"};
    private final String[] teacherLN = new String[]{"Локтева", "Андреева", "Антоненко","Котляренко","Макулова"};

    public Teacher createTeacher()
    {
        return new Teacher(randomString(teacherNames),randomString(teacherLN));
    }

    private String randomString(String[]studentNames)
    {
        int n = (int)Math.floor(Math.random() * studentNames.length);
        return  studentNames[n];

    }
}
