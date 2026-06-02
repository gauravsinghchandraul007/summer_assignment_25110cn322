//Write a program to Find x^n without pow(). 

package Day_6;

import java.util.Scanner;

public class Question_24 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        System.out.println(x + "^" + n + " = " + result);

        sc.close();
    }
}
