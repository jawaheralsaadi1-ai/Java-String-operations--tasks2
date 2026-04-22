
/*
* GOAL : Return a new string where each character is the original is repeated twice
* */
import java.util.Scanner; // require to get user input

public class Task1RepeatTwice {
    public static void main(String[] args) {

        //create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        // This means "Keep doing this forever"
        while (true) {
            // Ask the user to enter a String
            System.out.println("Enter any text to double the characters:");
            String text = input.nextLine();

            // go through index one by one
            String result = "";
            for (int i = 0; i < text.length(); i++) {
                char letter = text.charAt(i);
                result = result + letter + letter;
            }
            // Display the result
            System.out.println("Result : " + result);

        }
    }
}