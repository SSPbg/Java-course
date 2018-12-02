/* По зададено число n, да се изведе на екрана таблица по
следния начин:
*/

package Homework2;

import java.util.Scanner;

public class Homework2Task8IntTableLook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start Homework2task8");
        System.out.println("Enter a integer number n:");
        int n = sc.nextInt();

        for (int i = 1, temp = n - 1; i <= n; i++, temp += 2) {
            for (int j = 1; j <= n; j++) {
                System.out.print(temp);
            }
            System.out.println();
        }
        System.out.println("\n" + "End Homework2task8");
    }
}

