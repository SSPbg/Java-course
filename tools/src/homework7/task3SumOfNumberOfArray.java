package Homework7;

import java.util.Scanner;

public class task3SumOfNumberOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int[] array = new int[10];

        array[0] = num;
        array[1] = num;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        scanner.close();
    }
}
