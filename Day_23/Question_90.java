//Write a program to Find first repeating character.

package Day_23;

import java.util.HashSet;
import java.util.Scanner;

public class Question_90 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashSet<Character> set = new HashSet<>();
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (set.contains(ch)) {
                System.out.println("First repeating character: " + ch);
                found = true;
                break;
            }

            set.add(ch);
        }

        if (!found) {
            System.out.println("No repeating character found.");
        }

        sc.close();
    }
}
