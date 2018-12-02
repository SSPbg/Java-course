/* Въведете 2 различни целочислени числа от конзолата.
Запишете тяхната сума, разлика, произведение, остатък от деление
 и целочислено деление в отделни променливи и разпечатайте
  тези резултати в конзолата. Опитайте същото с числа с плаваща запетая.
  */

package Homework1;


import java.util.Scanner;

public class Homework1Task2double2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start of the HOMEWORK2");
        System.out.println("Enter first decimal number");
        double a = scanner.nextDouble();
        System.out.println("Enter second decimal number");
        double b = scanner.nextDouble();

        double sum = a + b;
        double subtraction = a - b;
        double multiplication = a * b;
        double division = a / b;
        double remainder = a % b;
        String text = "The sum of " + a + " and " + b + " is " + sum;
        String text1 = "The subtraction of " + a + " and " + b + " is " + subtraction;
        String text2 = "The multiplication of " + a + " and " + b + " is " + multiplication;
        String text3 = "The division of " + a + " and " + b + " is " + division;
        String text4 = "The remainder of " + a + " and " + b + " is " + remainder;

        System.out.println(text);
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);

        System.out.println("End of the HOMEWORK2!!!");

    }
}
