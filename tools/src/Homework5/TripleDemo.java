package Homework5;

public class TripleDemo {
    public static void main(String[] args) {
        Person person = new Person("Ogi", 26, true);
        Person person1 = new Person("Ani", 15, false);

        person.showPersonInfo();
        person1.showPersonInfo();

        Student student = new Student("Sashko", 18, true, 8.55);
        Student student1 = new Student("Tina", 19, false, 9.44);
        System.out.println();
        student.showStudentInfo();
        student1.showStudentInfo();
        System.out.println();
        Employee employee = new Employee("Mitko", 15, true, 40.00);
        Employee employee1 = new Employee("Emilia", 21, false, 50.00);

        employee.showEmployeeInfo();
        employee1.showEmployeeInfo();
        System.out.println();
        employee.calculateOvertime(15.4);
        employee1.calculateOvertime(12.5);
    }
}
