package Homework7;

import java.util.Scanner;

public class task1AliquotArrayBy3 {
    public static void main(String[] args) {
        int[] array = enterNumbers();

        calculate(array);
    }

    public static int[] enterNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + i);
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void calculate(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 && array[i] < min){
                min = array[i];
            }
        }

        if (min == Integer.MAX_VALUE) {
            System.out.println("No number");
        } else {
            System.out.println("The minimum number divided by 3 in this array is " + min);
        }
    }
}