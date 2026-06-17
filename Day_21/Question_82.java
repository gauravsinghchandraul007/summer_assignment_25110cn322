package Day_21;

import java.util.Scanner;

public class Question_82 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reverse = new StringBuilder(str).reverse().toString();

        System.out.println("Reversed string: " + reverse);
        sc.close();
    }
}
