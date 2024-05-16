package Basic;
import java.util.*;
// 1) Convert a binary number to decimal number.
// public class BinaryToDecimal {
//     public static void main(String[] args) {
//         String binary = "1101"; // Example binary number
//         int decimal = Integer.parseInt(binary, 2);
//         System.out.println("Decimal equivalent of binary " + binary + " is: " + decimal);
//     }
// }

// 2nd way

public class BinaryToDecimal {
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            char binaryDigit = binary.charAt(length - 1 - i);
            // Convert the binary digit to an integer (0 or 1)
            int digit = Character.getNumericValue(binaryDigit);
            decimal += digit * Math.pow(2, i);
        }

        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary no: ");
        String binary = sc.nextLine();
        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal of binary " + binary + " is: " + decimal);



        sc.close();
    }
}



