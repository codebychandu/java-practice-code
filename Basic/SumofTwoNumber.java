package Basic;


// Write a Java program to print the sum of two numbers, and take input from the user.

import java.util.Scanner;
public class SumofTwoNumber {

    public static void sum2num(String[] args){
        try (Scanner sv = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int a= sv.nextInt();
            System.out.print("Enter the second number: ");
            int b= sv.nextInt();
            int c=a+b;
            System.out.printf("Sum of %d %d is: %d" ,a,b,c);
        }

    }
    // sv.close();
    public static void main(String[] args) {
        sum2num(args);
    }
    
}
