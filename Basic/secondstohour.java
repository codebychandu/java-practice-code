package Basic;

import java.util.Scanner;

public class secondstohour {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the total seconds
        System.out.print("Input seconds: "); // Input seconds: 86399                                                   
        int seconds = in.nextInt();

        // Calculate the hours, minutes, and seconds
        int S = seconds % 60;  // Calculate the remaining seconds
        int H = seconds / 60;  // Convert total seconds to minutes
        int M = H % 60;         // Calculate the remaining minutes
        H = H / 60;            // Convert total minutes to hours

        // Display the time in the format HH:MM:SS
        System.out.print(H + ":" + M + ":" + S); // output: 23:59:59

        // Print a new line for better formatting
        System.out.print("\n");

        in.close();
    }
}
