

// Greatest Common Divisor of 2 numbers.

import java.util.*;
public class GCD {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: "); 
        int a = sc.nextInt();  // 50
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();  // 60
        int g = 0;
        for (int i = 1; i <= a; i++) {
            if (a%i == 0 && b%i == 0) {
                g = i;
            }
        }
        System.out.print("GCD is: " + g);  // ans 10


        sc.close();
    }
}