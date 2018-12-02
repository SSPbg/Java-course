/* Да се въведат от потребителя 2 числа.
И да се изведат на екрана всички числа от по-малкото до по-голямото.
*/

package Homework2;

import java.util.Scanner;

public class Homework2Task5Int2FromSmallToBig {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start Homework2task5");
        int a;
        int b;

        do {
            System.out.println("Enter first integer number: ");
            a = sc.nextInt();

            System.out.println("Enter second integer number: ");
            b = sc.nextInt();
        } while (a == b);

        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        for (int i = a; i <= b; i++) {
            System.out.printf(i + " ");
        }
        System.out.println("\n" + "End Homework2task5");
    }
}