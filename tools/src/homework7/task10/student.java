package Homework7.task10;

public class student {

    String name;
    double grade;




    @Override
    public boolean equals(Object obj) {
        student anotherStudent = (student) obj;
        return name.equals(anotherStudent.name) && hashCode() == anotherStudent.hashCode();
    }
}



