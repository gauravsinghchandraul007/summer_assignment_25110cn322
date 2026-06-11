//Write a program to Rotate array left. 

package Day_15;

import java.util.Scanner;

public class Question_58 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Store first element
        int first = arr[0];

        // Shift elements to the left
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Place first element at the end
        arr[n - 1] = first;

        System.out.println("Array after left rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
