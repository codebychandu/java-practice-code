package Practics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("This is Not Prime Number" + num);
        } else {
            System.out.println("This is Prime Number"+ num);
        }
        

        sc.close();
    }

    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (i%2==0) {
                return false;
            }
        }
        return true;
    }
}
