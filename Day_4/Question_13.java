//Write a program to Generate Fibonacci series. 

package Day_4;
import java.util.Scanner;

public class Question_13 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms to print Fibonacci Series: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
    
}
