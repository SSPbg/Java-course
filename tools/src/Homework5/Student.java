package Homework5;

public class Student extends Person {

    private double score;

    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }
    public void showStudentInfo(){
        System.out.println("Student name " + getName() + " Student age " + getAge() + " Student is male " + isMan() + " Student score " + score);
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
