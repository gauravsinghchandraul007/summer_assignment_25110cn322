//Write a program to Find sum and average of array.

import java.util.Scanner;

public class Question_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // Calculate average
        double average = (double) sum / n;

        // Display result
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
}

