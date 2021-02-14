package com.company;

import com.company.factory.StudentFactory;
import com.company.human.Student;
import com.company.human.Teacher;
import com.company.notHuman.Group;


public class TimeTable {
    private Group groups;
    private Teacher[] teachers;
    private AllDays allDays;
    private TimeTableDate[] timeTableDates;

    public TimeTable(Group group, Teacher[] teachers,
                     AllDays allDays, TimeTableDate[] timeTableDates) {
        this.groups = group;
        this.teachers = teachers;
        this.allDays = allDays;
        this.timeTableDates = timeTableDates;
    }

    public Group getGroups() {
        return groups;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public AllDays getAllDays() {
        return allDays;
    }

    public TimeTableDate[] getTimeTableDates() {
        return timeTableDates;
    }
}
