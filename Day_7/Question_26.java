//Write a program to Recursive Fibonacci. 

package Day_7;

import java.util.Scanner;

public class Question_26 {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: fib(0)=0, fib(1)=1
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        sc.close();
} 
}
