//Write a program to Find pair with given sum. 

package Day_16;

import java.util.HashSet;

public class Question_63 {
    public static void findPair(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return;
            }

            set.add(num);
        }

        System.out.println("No pair found.");
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 3, 6};
        int target = 9;

        findPair(arr, target);
    }
}
