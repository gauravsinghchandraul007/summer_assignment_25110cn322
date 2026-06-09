//Write a program to Count even and odd elements.
package Day_13;

import java.util.Scanner;

public class Question_52 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int evenCount = 0, oddCount = 0;

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count even and odd elements
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Display results
        System.out.println("Number of Even Elements = " + evenCount);
        System.out.println("Number of Odd Elements = " + oddCount);

        sc.close();
    }
}

