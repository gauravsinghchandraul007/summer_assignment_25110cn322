//Write a program to Print character pyramid.
//A
//ABA
//ABCBA
//ABCDCBA
//ABCDEDCBA

package Day_10;

public class Question_40 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Print ascending characters
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

            // Print descending characters
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
