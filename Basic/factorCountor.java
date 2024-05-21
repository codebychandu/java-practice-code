
package Basic;
import java.util.Scanner;
public class factorCountor {

    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for an integer input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Variable to count the number of factors
        int factorCount = 0;
        
        // Loop through all possible divisors and count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorCount++;
            }
        }
        
        // Output the number of factors
        System.out.println("Number of factors of " + number + " is: " + factorCount);
        
        // Close the scanner
        scanner.close();
    }
}