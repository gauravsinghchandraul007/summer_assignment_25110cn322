//Write a program to Find missing number in array.

package Day_16;

public class Question_61 {
     public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5}; // Missing number is 4
        int n = 5;

        int missing = findMissingNumber(arr, n);
        System.out.println("Missing Number: " + missing);
    }
}
