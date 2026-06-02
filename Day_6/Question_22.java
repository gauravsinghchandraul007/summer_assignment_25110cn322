//Write a program to Convert binary to decimal. 

package Day_6;

import java.util.Scanner;

public class Question_22 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number to convert it into decimal number: ");
        String binary = sc.nextLine();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal equivalent: " + decimal);

        sc.close();
    }
}
