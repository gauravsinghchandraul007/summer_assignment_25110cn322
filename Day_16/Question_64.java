//Write a program to Remove duplicates from array.

package Day_16;

import java.util.LinkedHashSet;

public class Question_64 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 3};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Add elements to set (duplicates are ignored)
        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array after removing duplicates:");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
