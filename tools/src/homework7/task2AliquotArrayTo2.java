package Homework7;

import java.util.Scanner;

public class task2AliquotArrayTo2 {
    public static void main(String[] args) {
        int[] array = enterNumbers();

        calculate(array);
    }

    private static int[] enterNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array aliquot to 2: ");
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < array.length / 2; i++) {
            System.out.println("Enter element: " + i);
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    private static void calculate(int[] array) {
        for (int j = 0; j < array.length / 2; j++){
            array[j + array.length / 2] = array[j];
        }
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
    }
}

