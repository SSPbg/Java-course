package Homework7;

import java.util.Arrays;
import java.util.Scanner;

public class task6CheckTwoArraysForEquality {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array A: ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter the elements in Array A:");
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in Array B: ");
        int m = scanner.nextInt();
        int[] arr2 = new int[m];

        System.out.println("Enter the elements in Array B:");
        for (int j = 0; j < m; j++) {
            arr2[j] = scanner.nextInt();
        }
        int flag = 0;

        if (arr1.length != arr2.length) {
            flag = 1;
        } else {
            for (int i = 0; i < arr2.length; i++) {
                if (arr1[i] != arr2[i]) {
                    flag = 2;
                }
            }
        }

        switch (flag) {
            case 0:
                System.out.println("The arrays are with the same size and they are equal!");
                break;
            case 1:
                System.out.println("The arrays are completely different. Size of arrays are different and they are not equal!");
                break;
            case 2:
                System.out.println("The arrays are with the same size but they are not equal!");
                break;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        scanner.close();
    }
}
