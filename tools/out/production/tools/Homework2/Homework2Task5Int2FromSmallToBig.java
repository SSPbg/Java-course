/* Да се въведат от потребителя 2 числа.
И да се изведат на екрана всички числа от по-малкото до по-голямото.
*/

package Homework2;

import java.util.Scanner;
import java.lang.Math;


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

        int c;
        int d;

        if (a < b) {
            c = a;
            d = b;
        } else {
            d = a;
            c = b;
        }

        for (int j = c; j <= d; j++) {
            System.out.printf(j + " ");
        }
        System.out.println();

        int e = Math.min(a, b);
        int f = Math.max(a, b);

        for (int k = e; k <= f; k++) {
            System.out.printf(k + " ");
        }
        System.out.println();

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