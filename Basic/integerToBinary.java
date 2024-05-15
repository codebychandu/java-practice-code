package Basic;

import java.util.Scanner;

public class integerToBinary {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        // Convert to binary using Integer.toBinaryString method
        String binaryString = Integer.toBinaryString(number);

        System.out.println("The binary number of " + number + " is: " + binaryString);
        sc.close();
    }
}

    