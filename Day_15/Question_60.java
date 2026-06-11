//Write a program to Move zeroes to end. 

package Day_15;

public class Question_60 {
     public static void moveZeroes(int[] arr) {
        int index = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Fill the remaining positions with zeroes
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZeroes(arr);

        System.out.println("Array after moving zeroes:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

