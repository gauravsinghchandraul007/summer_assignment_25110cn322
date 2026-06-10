// Write a program to linear search.

package Day_14;

import java.util.Scanner;

public class Question_53 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        // Linear Search
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}

