/* Въведете 3 числа от клавиатурата а1, а2 и а3.
Разменете стойностите им така, че а1 да има
стойността на а2, а2 да има стойността
на а3, а а3 да има старата стойност на а1.
 */

package Homework1;

import java.util.Scanner;

public class Homework1Task6int6 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start of the HOMEWORK6");
        System.out.println("Enter first integer number");
        int a1 = scanner.nextInt();
        System.out.println("Enter second integer number");
        int a2 = scanner.nextInt();
        System.out.println("Enter third integer number");
        int a3 = scanner.nextInt();

        int buffer = a1;

        a1 = a2;
        a2 = a3;
        a3 = buffer;

        System.out.println("A1 = " + a1 + "\n" + "A2 = " + a2 + "\n" + "A3 = " +a3);
        System.out.println("End of the HOMEWORK6!!!");
    }
}
