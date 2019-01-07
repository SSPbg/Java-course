package Homework7.task10;

import java.util.HashSet;
import java.util.Set;

public class studentDemo extends student {
    public static void main(String[] args) {

        Set<String> students = new HashSet<>();
        Set<Double> grade = new HashSet<>();

        students.add("Pepi Bogdanov");
        grade.add(7.8);
        students.add("Ogi Ovcharov");
        grade.add(6.5);
        students.add("Magi Pupalova");
        grade.add(9.8);
        students.add("Mimi Kasparova");
        grade.add(8.9);
        students.add("Ivo Jichev");
        grade.add(4.0);
        students.add("Ivo Jichev");
        grade.add(4.0);

        System.out.println(students);
        System.out.println(grade);

    }
}
