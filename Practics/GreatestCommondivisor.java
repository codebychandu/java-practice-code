package Practics;

import java.util.Scanner;

public class GreatestCommondivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Enter the second number: ");
        int second = sc.nextInt();

        int gcd = gcdfun(first, second);
        System.out.println(gcd);

        sc.close();
    }

    public static int gcdfun(int num1 , int num2){
        int gcd = 1;
        int i = 1;
        int least = least(num1, num2);
        while (i <= least) {
            if (num1%2==0 && num2%2==0) {
                gcd = i;
            } 
            i++;
        }

        return gcd;
    }
    public static int least(int num1, int num2){
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

}