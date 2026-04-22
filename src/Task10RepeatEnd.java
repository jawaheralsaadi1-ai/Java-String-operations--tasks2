
import java.util.Scanner;

public class Task10RepeatEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Setup the tool to read input from user
        while (true) {
            // Ask for user for input
            System.out.print("\nTask 9 - Enter first text : "); // Ask user for  input
            String text = input.nextLine(); // Save  text
            System.out.print("Enter number pf repeats (n) : "); //Ask user for integer input
            int n1 = Integer.parseInt(input.nextLine()); // Save  integer
            // Get number of repeats
            String end = text.substring(text.length() - n1); // Grab the last 'n' letters
            String res10 = ""; // Empty result string
            for (int i = 0; i < n1; i++) res10 += end; // Add the end part 'n' times
            System.out.println("Result: " + res10);// Display the result

        }

    }}
