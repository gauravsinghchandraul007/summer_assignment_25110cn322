package Day_1;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        
    
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number to count digits in it :");
     int n = sc.nextInt();
     int count = 0;

     if (n==0){
        count = 1;
     }
     else{
        while(n!=0){
            n = n/10;
            count++;
        }
     }
     System.out.println("The number of digits in given number are : "+count);
     sc.close();

}
}