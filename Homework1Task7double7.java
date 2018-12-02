/* Въведете 3 променливи от клавиатурата – час (целочислен тип),
сума пари (число с плаваща запетая), дали съм здрав – булев тип.
Съставете програма, която взема решения
 на базата на тези данни по следния начин:

- ако съм болен няма да излизам
- ако имам пари ще си купя лекарства
- ако нямам – ще стоя вкъщи и ще пия чай
- ако съм здрав
- ако имам по-малко от 10 лв ще отида на кафе и т.н
Полученото решение покажете като съобщение в конзолата.
 */

package Homework1;

import java.util.Scanner;

public class Homework1Task7double7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start of the HOMEWORK7");
        System.out.println("Entera amount of money decimal number");
        double money = scanner.nextDouble();
        System.out.println("How is your health?");
        boolean health = true;

        if (health != true && money >= 10) {
            System.out.println("I'm going to buy some medicine.");
        }
        if (health != true && money < 10) {
            System.out.println("Stay home and make a tea.");
        }
        if (health == true && money >= 10) {
            System.out.println("You are alright and you can do what you want!!!");
        }
        if (health = true && money < 10) {
            System.out.println("Go out and drink some beers!!!");
        }
        System.out.println("End of the HOMEWORK7");
    }
}
