package Day_21;

import java.util.Scanner;

public class Question_84 {
    
public class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a lowercase string: ");
        String str = sc.nextLine();

        String upperStr = str.toUpperCase();

        System.out.println("Uppercase string: " + upperStr);
        sc.close();
    }
} }
