import java.util.Scanner;

public class Task7BobThere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            // Ask for user for input
            System.out.print("\nEnter text : ");
            String text = input.nextLine(); // Save the text
            boolean bobFound = false; // Start by that we don't found it
            //  Loop through the String
            for (int i = 0; i <= text.length() - 3; i++) {
                    bobFound = true;
                if (text.charAt(i) == 'b' && text.charAt(i + 2) == 'b') {
                    bobFound = true;
                }
            }
            // Display the result
            System.out.println("Result: " + bobFound);
            }
        }
    }