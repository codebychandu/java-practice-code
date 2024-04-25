
package Basic;

import java.util.Scanner;

// Questions1: Write a Java program to Sum two binary numbers.

// import java.util.Scanner;

// public class binarySum {

//     static String addBinary(String a, String b){
//         int num1 = Integer.parseInt(a, 2);
//         int num2 = Integer.parseInt(b, 2);
//         int sum = num1 + num2;
        

//         return Integer.toBinaryString(sum);

//     }

//     // Write a Java program to Sum two binary numbers.
//     static String MulBinary(String a, String b){
//         int num1 = Integer.parseInt(a, 2);
//         int num2 = Integer.parseInt(b, 2);
//         int sum = num1 * num2;
        

//         return Integer.toBinaryString(sum);

//     }
     
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first binary number:");
//         String a = sc.nextLine();
//         System.out.println("Enter the second binary number: ");
//         String b = sc.nextLine();
        
//         String sum = addBinary(a, b);
//         System.out.println("Sum of two binary number: " +  sum);
//         String mul = MulBinary(a, b);
//         System.out.println("Mul of two binary number: " +  mul);
        
//         sc.close();
//     }
    
// }

// Write a Java program to convert an integer number to a binary number. 

public class binary{

    
    // 2nd way method
    public static String convertToBinary(int dec_num){
        return Integer.toBinaryString(dec_num);   
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        
        // 1st way
        int dec_num, quot, i = 1, j;
        
        System.out.print("Input a Decimal Number: ");
        dec_num = sc.nextInt();
        quot = dec_num;
        
        int bin_num[] = new int[100];
        // Convert the decimal number to binary and store binary digits
        while (quot != 0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }
        // Display the binary representation of the decimal number
        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
        
        
        // 2nd way method calling
        String binary = convertToBinary(dec_num);
        System.out.println("Binary representation: " + binary);
        
        
    }
}