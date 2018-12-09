/* Въведете число от клавиатурата и определете дали е просто. Просто
число е това което се дели САМО на 1 и на себе си.
*/

package Homework2;

import java.util.Scanner;

public class Homework2Task10SimpleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start Homework2task10");
        int x;
        boolean isPrime = true;

        do {
            System.out.println("Enter a integer number bigger than one:");
            x = sc.nextInt();
        } while (x < 2);

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                System.out.println(x + " is not a prime.");
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(x + " is a prime number.");
        }

        System.out.println("End Homework2task10");

    }
}

