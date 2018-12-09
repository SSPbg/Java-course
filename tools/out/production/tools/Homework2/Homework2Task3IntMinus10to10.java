/* Да се изведат на екрана всички нечетни числа от -10 до 10.
*/

package Homework2;

public class Homework2Task3IntMinus10to10 {

    public static void main(String[] args) {
        System.out.println("Start Homework2task3");
        for (int i = -10; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("\n" + "End Homework2task3");
    }
}