
/*
 Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

 */
import java.util.*;

public class fibonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int count = sc.nextInt();
        int n1 = 0, n2 = 1, n3, i;
        System.out.print(n1 + " " + n2);
        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

        sc.close();

    }

}
