package Homework7;

import java.util.Scanner;

public class task7SumOfPreviousAndNextElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[arr1.length];

        System.out.println("Enter the elements in Array:");
        for (int i = 0; i < n; i++) {

            arr1[i] = scanner.nextInt();
        }


        for (int j = 0; j < arr1.length; j++) {
            if (j == 0 || j == arr1.length - 1) {
                arr2[j] = arr1[j];
            } else {
                arr2[j] = arr1[j - 1] + arr1[j + 1];
            }
        }

        for (int k : arr2) {
            System.out.print(k + " ");
        }
        scanner.close();
    }
}

