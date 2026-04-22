import java.util.Scanner;

public class Task6XyzThere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter text ");
            String text = input.nextLine();


            boolean found = false;

            // 1. Check if it starts with xyz
            if (text.startsWith("xyz")) {
                found = true;
            }

            //  Check the rest of the string
            // We start at i = 1 so that (i - 1) is always safe (index 0)
            for (int i = 1; i <= text.length() - 3; i++) {
                String checkXyz = text.substring(i, i + 3);
                char before = text.charAt(i - 1);

                if (checkXyz.equals("xyz") && before != '.') {
                    found = true;

                }
            }
            // Display the result
            System.out.println("Result: " + found);
        }

    }
}