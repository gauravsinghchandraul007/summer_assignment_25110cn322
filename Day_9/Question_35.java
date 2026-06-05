//Write a program to Print repeated character pattern.
//A
//BB
//CCC
//DDDD
//EEEEE

package Day_9;

public class Question_35 {
    public static void main(String[] args) {
        int rows = 5;
        char ch = 'A';

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
}
