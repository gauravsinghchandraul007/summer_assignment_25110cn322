//Write a program to Print prime numbers in a range.

package Day_3;
import java.util.Scanner;
public class Question_10 {  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {
            if (num > 1) {
                boolean isPrime = true;

                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
        }

        sc.close();
    }
}
    

