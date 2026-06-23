//Write a program to Create quiz application. 

package Day_26;

import java.util.Scanner;

public class Question_104 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        // Question 1
        System.out.println("1. What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) New Delhi");
        System.out.println("c) Kolkata");
        System.out.print("Your answer: ");
        char ans1 = sc.next().charAt(0);

        if (ans1 == 'b' || ans1 == 'B') {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which language is used for Android app development?");
        System.out.println("a) Java");
        System.out.println("b) Python");
        System.out.println("c) C");
        System.out.print("Your answer: ");
        char ans2 = sc.next().charAt(0);

        if (ans2 == 'a' || ans2 == 'A') {
            score++;
        }

        // Question 3
        System.out.println("\n3. How many days are there in a week?");
        System.out.println("a) 5");
        System.out.println("b) 6");
        System.out.println("c) 7");
        System.out.print("Your answer: ");
        char ans3 = sc.next().charAt(0);

        if (ans3 == 'c' || ans3 == 'C') {
            score++;
        }

        // Display Result
        System.out.println("\n===== Quiz Result =====");
        System.out.println("Your Score: " + score + "/3");

        if (score == 3) {
            System.out.println("Excellent!");
        } else if (score == 2) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        sc.close();
    }
}
