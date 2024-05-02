package Basic;

// question1: read a string and read a number . display the nth character of from the string in java


import java.util.Scanner;

public class readString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String a = sc.nextLine();
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        char ch = a.charAt(number -1);
        System.out.println("your charector is: " + ch);

        sc.close();
    }
}
