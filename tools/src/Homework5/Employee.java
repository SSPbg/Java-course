package Homework5;

public class Employee extends Person {
    private double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public double calculateOvertime(double hours) {
        if (getAge() < 18) {
            System.out.println("The employee is younger then 18 no money!!!");
        } else {
            double calculateOvertime;
            double hourSalary = (daySalary / 8) * 1.5;
            calculateOvertime = hours * hourSalary;
            System.out.println("The overtime of the employee is " + calculateOvertime);
        }
        return hours;
    }
    public void showEmployeeInfo() {
        System.out.println("Worker name: " + getName() + " Worker age: " + getAge() + " Worker is male: " + isMan() + " Worker day salary: " + daySalary);

    }
}


