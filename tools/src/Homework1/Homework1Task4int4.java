/* Въведете 2 различни числа от конзолата и ги разпечатайте в нарастващ ред.
*/

package Homework1;

import java.util.Scanner;

public class Homework1Task4int4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start of the HOMEWORK4");
        System.out.println("Enter first integer number");
        int a = scanner.nextInt();
        System.out.println("Enter second integer number");
        int b = scanner.nextInt();
        System.out.println("The integer numbers in ascending order");

        if (a < b) {
            System.out.println(a + "\n" + b);
        } else {
            System.out.println(b + "\n" + a);
        }
        if (a == b) {
            System.out.println("The integer numbers are the same!!! Enter 2 different integer numbers");
        }
        System.out.println("End of the HOMEWORK4!!!");
    }
}
