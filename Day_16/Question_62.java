// Write a program to Find maximum frequency element.

package Day_16;

import java.util.HashMap;

public class Question_62 {
     public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 3, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int maxElement = arr[0];

        // Find element with maximum frequency
        for (int key : map.keySet()) {
            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                maxElement = key;
            }
        }

        System.out.println("Element with maximum frequency: " + maxElement);
        System.out.println("Frequency: " + maxFreq);
    }
}

