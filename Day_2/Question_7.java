//Write a program to find product of digits .

package Day_2;
import java.util.Scanner;
public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int product = 1;

        while (number != 0) {
            int digit = number % 10;   // get last digit
            product = product * digit; // multiply digit
            number = number / 10;      // remove last digit
        }

        System.out.println("Product of digits = " + product);
        sc.close();
    }
}