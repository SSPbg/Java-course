/* Да се изведат съобщения към потребителя и да се прочетат 2 числа от клавиатурата
 A и B (може да са с плаваща запетая – double).
 После да се прочете 3-то число C и да се провери дали то е м/у A и B.
 Да се изведе подходящо съобщение за това дали C е между A и B.
 */

package Homework1;

import java.util.Scanner;

public class Homework1Task1double1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start of the HOMEWORK1");
        System.out.println("Enter decimal number A: ");
        double a = scanner.nextDouble();
        System.out.println("Enter decimal number B: ");
        double b = scanner.nextDouble();
        System.out.println("Enter decimal number C: ");
        double c = scanner.nextDouble();

        if ((c > a && c < b) || (c > b && c < a)) {
            System.out.println("Yes it is between A and B");
        } else {
            System.out.println("No it is not between A and B");
        }
        System.out.println("End of the HOMEWORK1!!!");
    }
}