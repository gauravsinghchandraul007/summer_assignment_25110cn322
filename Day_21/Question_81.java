package Day_21;

public class Question_81 {
     public static void main(String[] args) {
        String str = "Hello World";

        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
        }

        System.out.println("Length of the string = " + count);
    }
}

