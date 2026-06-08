//Write a program to Write function for perfect number.

package Day_12;

import java.util.Scanner;

public class Question_48 {
    public class PerfectNumber {

    static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPerfect(num))
            System.out.println(num + " is a Perfect Number");
        else
            System.out.println(num + " is not a Perfect Number");

        sc.close();
    }
}
}