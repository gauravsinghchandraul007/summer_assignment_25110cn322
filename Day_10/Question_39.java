//Write a program to Print number pyramid.
//1
//121
//12321
//1234321
//123454321

package Day_10;

public class Question_39 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
