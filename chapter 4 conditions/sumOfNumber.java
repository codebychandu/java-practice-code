
// Sum of Natural no by taking input from the user.

import java.util.*;
public class sumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of all number upto " + a + " is: " + sum);
        sc.close();
    }
}