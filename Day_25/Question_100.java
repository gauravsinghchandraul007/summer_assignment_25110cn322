//Write a program to Sort words by length. 

package Day_25;

import java.util.Arrays;
import java.util.Comparator;

public class Question_100 {
     public static void main(String[] args) {
        String[] words = {"apple", "kiwi", "banana", "fig", "orange"};

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println("Words sorted by length:");
        for (String word : words) {
            System.out.println(word);
        }
}
}