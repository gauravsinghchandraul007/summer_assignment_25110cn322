//Write a program to Count set bits in a number. 

package Day_6;

import java.util.Scanner;

public class Question_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        while (num > 0) {
            count += num & 1; // Check if the last bit is 1
            num >>= 1;        // Right shift by 1
        }

        System.out.println("Number of set bits: " + count);

        sc.close();
    }
}
