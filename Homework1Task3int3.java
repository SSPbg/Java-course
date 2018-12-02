/* Въведете 2 различни числа от конзолата
и разменте стойността им. Разпечатайте новите стойности
*/

package Homework1;

import java.util.Scanner;

public class Homework1Task3int3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start of the HOMEWORK3");
        System.out.println("Enter first integer number");
        int a = scanner.nextInt();
        System.out.println("Enter second integer number");
        int b = scanner.nextInt();
        System.out.println("Before swap");
        System.out.println("First integer number = " + a);
        System.out.println("Second integer number = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap");
        System.out.println("First integer number = " + a);
        System.out.println("Second integer number = " + b);

        if (a == b) {
            System.out.println("The integer numbers are the same");
        }
        System.out.println("End of the HOMEWORK3!!!");
    }
}
