
/*
 * GOAL :Count how many times the substring
 *  "hi" appears in the given string.
 * */
import java.util.Scanner;

public class Task2CountHi {
    public static void main(String[] args) {

        //create a Scanner object to read input
    Scanner input = new Scanner(System.in);

    // This means "Keep doing this forever"
        while(true) {
        // Ask the user to enter a String
        System.out.println("Enter text to count 'hi' word:");
        String text = input.nextLine();
         int hiCount = 0;
         for(int i = 0; i < text.length()-1; i++){
             if(text.substring(i, i + 2).equals("hi")){
                 hiCount++;
             }
         }
        // Display the result
        System.out.println("The number of 'hi' word is : " + hiCount);
    }

}
}
