//Write a program to Find largest prime factor 

package Day_5;

import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        long largestPrimeFactor = -1;

        // Divide by 2 until num becomes odd
        while (num % 2 == 0) {
            largestPrimeFactor = 2;
            num /= 2;
        }

        // Check odd factors
        for (long i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                largestPrimeFactor = i;
                num /= i;
            }
        }

        // If num is still greater than 2, it is prime
        if (num > 2) {
            largestPrimeFactor = num;
        }

        System.out.println("Largest Prime Factor = " + largestPrimeFactor);

        sc.close();
    }
}
