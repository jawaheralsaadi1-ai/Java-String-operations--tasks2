
/*
* GOAL : Count patterns like "co?e" where ? can be any character. .
* */
import java.util.Scanner;
public class Task4CountCode {
    public static void main(String[] args) {

        //create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // This means "Keep doing this forever"
        while (true) {
            // Ask the user to enter a String
            System.out.println("Enter text to catch How many co?e Word appear:");
            String text = input.nextLine();

            int codeCount = 0;
            for (int i = 0; i < text.length() - 3; i++) {
                if (text.charAt(i) == 'c' && text.charAt(i + 1) == 'o' && text.charAt(i + 3) == 'e') {
                    codeCount++;
                }
            }
// Display the result
                System.out.println("Result " + codeCount);
            }
        }

}