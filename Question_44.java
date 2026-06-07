import java.util.Scanner;

public class Question_44 {
    //Write a program to Write function to find factorial
      public static long findFactorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long factorial = findFactorial(num);

        System.out.println("Factorial of " + num + " = " + factorial);

        sc.close();
    }
}

