package Basic;

import java.util.Scanner;
// This program will great any person by there name.


public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a=sc.nextLine();
        System.out.println("Hello" + a);
        sc.close();
    }
}