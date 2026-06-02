//Write a program to Convert decimal to binary. 

package Day_6;

import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number to convert it into binary number: ");
        int decimal = sc.nextInt();

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary equivalent: " + binary);

        sc.close();
    }
}
