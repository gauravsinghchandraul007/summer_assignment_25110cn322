//Write a program to Check strong number.

package Day_5;

import java.util.Scanner;

public class Question_18 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a strong number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            num /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong Number.");
        } else {
}}}