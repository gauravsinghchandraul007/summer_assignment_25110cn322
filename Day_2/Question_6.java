//Write a program to Reverse a number.

package Day_2;
import java.util.Scanner;
public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;          // get last digit
            reverse = reverse * 10 + digit;  // build reversed number
            number = number / 10;            // remove last digit
        }

        System.out.println("Reversed number = " + reverse);

        sc.close();
    }
}

