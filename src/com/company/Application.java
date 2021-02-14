package com.company;

import com.company.factory.AudienceFactory;
import com.company.factory.StudentFactory;
import com.company.factory.TeacherFactory;
import com.company.factory.TimeFactory;
import com.company.human.Student;
import com.company.human.Teacher;
import com.company.notHuman.Audience;
import com.company.notHuman.Cathedra;
import com.company.notHuman.Faculty;
import com.company.notHuman.Group;

public class Application {

    public static void main(String[] args) {
        new Application().studentsRun();
    }

    private void studentsRun() {
        StudentFactory studentFactory = new StudentFactory();

        AudienceFactory audienceFactory = new AudienceFactory();

        TimeFactory timeFactory = new TimeFactory();

        TeacherFactory teacherFactory = new TeacherFactory();

        Group group1 = new Group("AKTCI-20-1", new Student[]{
                studentFactory.createStudent(),
                studentFactory.createStudent(),
                studentFactory.createStudent(),
                studentFactory.createStudent(),
                studentFactory.createStudent(),
                studentFactory.createStudent(),
        });

        Group group2 = new Group("AKTCI-20-2", new Student[]{
                studentFactory.createStudent(),
                studentFactory.createStudent(),
                studentFactory.createStudent(),
                studentFactory.createStudent(),
                studentFactory.createStudent(),
                studentFactory.createStudent(),
        });


        Cathedra cathedra = new Cathedra("Компьютерные технологии",
                new Teacher[]{teacherFactory.createTeacher()},
                new Audience[]{audienceFactory.createAudience()});

        Cathedra cathedra2 = new Cathedra("Автоматизация",
                new Teacher[]{teacherFactory.createTeacher()},
                new Audience[]{audienceFactory.createAudience()});

        Faculty faculty1 = new Faculty("КИТ", cathedra);
        Faculty faculty2 = new Faculty("АКИТ", cathedra2);

//        System.out.println(cathedra+"\n");
//        System.out.println(faculty1+"\n");

        TimeTable timeTable = new TimeTable(group1,
                new Teacher[]{teacherFactory.createTeacher()},
                AllDays.MONDAY, new TimeTableDate[]{timeFactory.createTimeDate()});

        TimeTable timeTable2 = new TimeTable(group2,
                new Teacher[]{teacherFactory.createTeacher()},
                AllDays.TUESDAY, new TimeTableDate[]{timeFactory.createTimeDate()});

        //    System.out.println("Расписание:\n"+faculty1+"\n"+timeTable);
        //  System.out.println("Расписание:\n"+faculty2+"\n"+timeTable2);

        Object[][] table = new String[8][];
        table[0] = new String[]{"Факультет:", " Кафедра:", ""};
        table[1] = new String[]{faculty1.toString(), cathedra2.toString(), ""};
        table[2] = new String[]{"---------------", "-----------------", ""};
        table[3] = new String[]{"Аудитория:", " Преподователь:", ""};
        table[4] = new String[]{audienceFactory.createAudience().toString(), teacherFactory.createTeacher().toString(), ""};
        table[5] = new String[]{"----------------", "-----------------", ""};
        table[6] = new String[]{"Группа:", " День:", "Время:"};
        table[7] = new String[]{timeTable.getGroups().getName(), timeTable.getAllDays().toString(), timeFactory.createTimeDate().toString()};

        System.out.format("%-10s%-10s%-5s%-5s\n", "-----------", "--------------", "-----Расписание----", "------------------------------------------");
        for (int i = 0; i < table.length; i++) {
            Object[] row = table[i];
            System.out.format("%-10s%-25s%-10s%-20s%-10s%-10s%-15s\n", "|", row[0], "|", row[1], "|", row[2], "|");
        }
        System.out.format("%-10s%-10s%-5s%-5s\n", "-----------", "--------------", "-------------------", "------------------------------------------");

    }
}
