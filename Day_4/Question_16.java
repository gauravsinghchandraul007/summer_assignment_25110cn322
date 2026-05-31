// write a Program  to print Armstrong numbers in a range in java .

package Day_4;
import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            int originalNum = num;
            int temp = num;
            int digits = String.valueOf(num).length();
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == originalNum) {
                System.out.print(originalNum + " ");
            }
        }
    sc.close();

    }
}