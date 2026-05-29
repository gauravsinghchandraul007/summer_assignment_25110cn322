
//Write a program to check whether a number is  palindrome.

package Day_2;
import java.util.Scanner;
public class Question_8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if (original == reverse) {
            System.out.println("The number is a Palindrome.");
        } else {
            System.out.println("The number is not a Palindrome.");
        }

        sc.close();
    }
}

