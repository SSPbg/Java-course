package Homework7;

import java.util.Scanner;

public class task8IdenticalElementsInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements in Array:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int startIndex = 0;
        int endIndex = 0;
        int counter = 0;
        int tempCounter;

        for (int i = 0; i < arr.length; i++) {
            tempCounter = 0;
            while (arr[i] == arr[i + tempCounter]) {
                tempCounter++;
                if (i + tempCounter >= arr.length) {
                    break;
                }
            }
            if (tempCounter > counter) {
                counter = tempCounter;
                startIndex = i;
                endIndex = i + counter;
            }
        }

        if (counter > 1) {
            for (int i = startIndex; i < endIndex; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("The elements in this array are not identical!");
        }
        scanner.close();
    }
}
