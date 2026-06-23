package Day_25;

import java.util.Arrays;

public class Question_99 {
     public static void main(String[] args) {
        String[] names = {"Rahul", "Ankit", "Priya", "Neha", "Aman"};

        Arrays.sort(names);

        System.out.println("Names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
