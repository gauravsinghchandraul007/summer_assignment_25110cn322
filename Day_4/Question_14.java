//Write a program to Find nth Fibonacci term. 

package Day_4;
import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 0;

        if (n == 0) {
            System.out.println("Nth Fibonacci term: 0");
        } else if (n == 1) {
            System.out.println("Nth Fibonacci term: 1");
        } else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("Nth Fibonacci term: " + c);
        }

        sc.close();
    }
    
}
