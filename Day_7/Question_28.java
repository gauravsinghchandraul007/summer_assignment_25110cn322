package Day_7;

import java.util.Scanner;

public class Question_28 {
public static int reverse(int n, int rev) {
        if (n == 0)
            return rev;

        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Reversed number: " + reverse(number, 0));

        scanner.close();
    }
}

