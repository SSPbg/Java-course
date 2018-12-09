/* Започвайки от 3, да се изведат на екрана първите n числа които се делят
на 3. Числата да са разделени със запетая.
*/

package Homework2;

import java.util.Scanner;

public class Homework2Task7StartFrom3DivisionBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start Homework2task7");
        System.out.println("Enter a integer number n:");
        int n = scanner.nextInt();
        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(i);
                if (i < n - 2) {
                    System.out.print(",");
                }
            }

        }
        System.out.println("\n" + "End Homework2task7");
    }
}

