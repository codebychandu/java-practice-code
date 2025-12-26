package Practics;

import java.util.Scanner;

public class Pelindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        boolean result = isPalindrome(num);
        System.out.println("Result: "+ result);

        sc.close();
    }
    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        return num == reverse(num);
    }

    public static int reverse(int num) {
        int newnum = 0;
        while (num > 0 ) {
            int digit = num % 10;
            newnum = newnum * 10 + digit;
            num /=10;
        }
        return newnum;
    }
}
