// Print multiplication tab;e of given number .

package Day_1;

 import java.util.Scanner;
  public class Question_2 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to write table : ");
        int n = sc.nextInt();
       

        for(int i = 1;i<=10;i++){
            System.out.println(n+"X"+i+"="+n*i);
sc.close();        }
    }

  }
