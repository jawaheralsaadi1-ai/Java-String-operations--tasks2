/*
* GOAL : Return true if "cat" and "dog" appear the same number of times.
 * */
import java.util.Scanner;

public class Task3CatDog {
    public static void main(String[] args) {

        //create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // This means "Keep doing this forever"
        while (true) {
            // Ask the user to enter a String
            System.out.println("Enter text :");
            String text = input.nextLine();
            int countCat = 0;
            int countDog = 0;
            for (int i = 0; i < text.length() - 2; i++) {
                String sub = text.substring(i, i + 3);
                if (sub.equals("cat")) countCat++;
                if (sub.equals("dog")) countDog++;
            }
// Display the result
            System.out.println("Result " + (countCat == countDog));
        }
    }
}
