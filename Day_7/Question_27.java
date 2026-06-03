//Write a program to Recursive sum of digits.

package Day_7;

import java.util.Scanner;

public class Question_27 {
    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0; // Base case
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Sum of digits = " + sumOfDigits(num));

        sc.close();
    }
}
