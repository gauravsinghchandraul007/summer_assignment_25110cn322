//Write a program to Print factors of a number. 

package Day_5;

import java.util.Scanner;


public class Question_19 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factors are:");

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.print(i + " ");

                if (i != num / i) {
                    System.out.print((num / i) + " ");
                }
    
}
        sc.close();
    }
}
}