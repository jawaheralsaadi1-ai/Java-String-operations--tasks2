import java.util.Scanner;
public class Task8xyBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Setup the tool to read input from user
        while (true) {
            // Ask for user for input
            System.out.print("\nTask 8 - Enter text: "); // Ask for input
            String text = input.nextLine(); // Save the text

            // --- TASK 8: xyBalance ---
            int lastX = text.lastIndexOf('x'); // Find the very last 'x'
            int lastY = text.lastIndexOf('y'); // Find the very last 'y'
            // Display the result
            System.out.println("Result: " + (lastY >= lastX));

}}}