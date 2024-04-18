import java.util.Scanner;

public class getChar {
    // Define the main method.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Original String = " + str);

        int index1 = str.charAt(0); // Get the ASCII value of the character at position 0.
        int index2 = str.charAt(10); // Get the ASCII value of the character at position 10.

        System.out.println("The character at position 0 is " +(char)index1); 
        System.out.println("The character at position 10 is " +(char)index2); 

        sc.close();
    }
}