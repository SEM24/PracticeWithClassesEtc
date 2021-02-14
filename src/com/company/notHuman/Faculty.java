package com.company.notHuman;

public class Faculty {

    private String facultyName;
    private Cathedra cathedra;


    public Faculty (String facultyName, Cathedra cathedra) {
        this.facultyName = facultyName;
        this.cathedra = cathedra;
    }

    @Override
    public String toString() {
        return  facultyName  ;
    }
}
