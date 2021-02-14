package com.company.notHuman;

import com.company.human.Teacher;


public class Cathedra {

    private String cathedraName;
    private Teacher[] teacher;
    private Audience[] audiences;

    public Cathedra(String cathedraName, Teacher[] teacher, Audience[] audiences) {
        this.cathedraName = cathedraName;
        this.teacher = teacher;
        this.audiences = audiences;
    }

    public Teacher[] getTeacher() {
        return teacher;
    }

    public Audience[] getAudiences() {
        return audiences;
    }

    @Override
    public String toString() {
        return cathedraName;
    }



}
