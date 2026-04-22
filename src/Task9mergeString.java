import java.util.Scanner;


public class Task9mergeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Setup the tool to read input from user
        while (true) {
            // Ask for user for input
            System.out.print("\nTask 9 - Enter first text: "); // Ask for first input
            String text1 = input.nextLine(); // Save first text
            System.out.print("Enter second text: "); //Ask for second input
            String text2 = input.nextLine(); // Save second text
            String result9 = ""; // Start with an empty result
            int max = Math.max(text1.length(), text2.length()); // Find which word is longer
            for (int i = 0; i < max; i++) { // Loop as many times as the longest word
                if (i < text1.length()) result9 += text1.charAt(i); // Add letter from 'a' if it exists
                if (i < text2.length()) result9 += text2.charAt(i); // Add letter from 'b' if it exists
            }
            System.out.println("Result: " + result9);

        }
    }}