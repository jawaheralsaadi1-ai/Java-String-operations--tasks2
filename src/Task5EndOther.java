
/*
 * GOAL : Return true if one string appears at the end of the other, ignoring case.
 * */

import java.util.Locale;
import  java.util.Scanner;

public class Task5EndOther {

        public static void main(String[] args) {

            //create a Scanner object to read input
            Scanner input = new Scanner(System.in);

            // This means "Keep doing this forever"
            while (true) {
                // Ask the user to enter a String
                System.out.println("\nEnter first String:");
                String first = input.nextLine().toLowerCase();
                System.out.println("Enter second String:");
                String second = input.nextLine().toLowerCase();
                boolean result = first.endsWith(second) || second.endsWith(first);
                System.out.print("Result :" +result);
            }
        }}