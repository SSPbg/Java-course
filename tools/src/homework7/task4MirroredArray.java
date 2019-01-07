package Homework7;

import java.util.Arrays;
import java.util.Scanner;

public class task4MirroredArray {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int num = scanner.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element: " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        boolean mirrored = true;
        for(int i = 0; i < (array.length + 1) / 2; i++) {
            if (array[i] != array[num - i - 1]) {
                mirrored = false;
            }
        }
        System.out.print("Mirrored? " + mirrored);
        scanner.close();
    }
}


