/* Да се прочете число от екрана(конзолата)
 и да се изведе сбора на всички числа между 1 и въведеното число.
 */

package Homework2;

import java.util.Scanner;

public class Homework2Task6SumOfOneInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Start Homework2task6");
        System.out.println("Enter a integer number");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("The sum is " + sum);
        System.out.println("End Homework2task6");
    }

}