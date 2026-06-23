//Write a program to Merge two sorted arrays. 

package Day_25;

import java.util.Arrays;

public class Question_97 {
    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        // Merge the arrays
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] result = merge(arr1, arr2);

        System.out.println("Merged Array: " + Arrays.toString(result));
        
    }
}
