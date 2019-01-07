package Homework7.task10;

import java.util.*;


public class collegeExtend extends college {
    public static void main(String[] args) {

        List<String> studentList = new ArrayList<>();

        studentList.add("Pepi Bogdanov");
        studentList.add("Ogi Ovcharov");
        studentList.add("Magi Pupalova");
        studentList.add("Mimi Kasparova");
        studentList.add("Ivo Jichev");

        Collections.sort(studentList);
        System.out.println(studentList);

        List<Double> grade = new ArrayList<>();
        grade.add(7.8);
        grade.add(6.5);
        grade.add(9.8);
        grade.add(8.9);
        grade.add(4.0);

        Collections.sort(grade);
        Collections.reverse(grade);
        System.out.println(grade);


    }
}