package Basic;

import java.util.Scanner;

// Write a Java program to print the ASCII value of a given character. 
public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char: ");
        char a = sc.next().charAt(0);
        int Val = (int) a;
        System.out.println("The ASCII Value of " + a + " is : " + Val );

        sc.close();

    }
    
}
