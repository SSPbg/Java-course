/* Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ ред.
*/

package Homework1;

import java.util.Scanner;

public class Homework1Task5int5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start of the HOMEWORK5");
        System.out.println("Enter first integer number");
        int a = scanner.nextInt();
        System.out.println("Enter second integer number");
        int b = scanner.nextInt();
        System.out.println("Enter third integer number");
        int c = scanner.nextInt();

        if (a > b && a > c && b > c){
            System.out.println("The integer numbers in descending order");
            System.out.println(a + "\n" + b + "\n" + c);
        }
        if (a > b && a > c && b < c){
            System.out.println("The integer numbers in descending order");
            System.out.println(a + "\n" + c + "\n" + b);
        }
        if (b > a && b > c && a > c){
            System.out.println("The integer numbers in descending order");
            System.out.println(b + "\n" + a + "\n" + c);
        }
        if (b > a && b > c && a < c){
            System.out.println("The integer numbers in descending order");
            System.out.println(b + "\n" + c + "\n" + a);
        }
        if (c > a && c > b && a > b){
            System.out.println("The integer numbers in descending order");
            System.out.println(c + "\n" + a + "\n" + b);
        }
        if (c > a && c > b && a < b){
            System.out.println("The integer numbers in descending order");
            System.out.println(c + "\n" + b + "\n" + a);
        }
        if (a == b || b == c || c == a ) {
            System.out.println("Enter 3 different integer numbers");
            System.out.println(a + "\n" + b);
        }
        System.out.println("End of the HOMEWORK5!!!");
    }
}
