package Homework7;

import java.util.Scanner;

public class task9PrintArrayBackwards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter the elements in Array:");
        for(int i = 0; i < n; i++)
        {
            arr1[i] = scanner.nextInt();
        }

        // with using additional array
        int[] arr2 = new int[arr1.length];
        for (int i = 0, ii = arr2.length - 1; i < arr2.length; i++, ii--) {
            arr2[i] = arr1[ii];
            System.out.print(arr2[i] + " ");
        }

        // without using another array
        System.out.println();

        for (int i = 0, ii = arr1.length - 1; i < arr1.length / 2; i++, ii--) {
            arr1[i] = arr1[i] + arr1[ii];
            arr1[ii] = arr1[i] - arr1[ii];
            arr1[i] = arr1[i] - arr1[ii];
        }
        for (int i1 : arr1) {
            System.out.print(i1 + " ");
        }
        scanner.close();
    }
}
