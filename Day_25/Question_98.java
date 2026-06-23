//Write a program to Find common characters in strings.

package Day_25;

import java.util.HashSet;

public class Question_98 {
      public static void main(String[] args) {
        String str1 = "programming";
        String str2 = "gaming";

        HashSet<Character> set = new HashSet<>();
        HashSet<Character> common = new HashSet<>();

        // Store characters of first string
        for (char ch : str1.toCharArray()) {
            set.add(ch);
        }

        // Find common characters
        for (char ch : str2.toCharArray()) {
            if (set.contains(ch)) {
                common.add(ch);
            }
        }

        System.out.println("Common characters: " + common);
    }
}
