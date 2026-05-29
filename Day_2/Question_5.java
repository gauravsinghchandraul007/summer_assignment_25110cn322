//Write a program to find sum of digits of a number.
package Day_2;
import java.util.Scanner;

public class Question_5 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        int sum = 0;

        while (number != 0) {
            int digit = number % 10; // get last digit
            sum = sum + digit;       // add digit to sum
            number = number / 10;    // remove last digit
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}