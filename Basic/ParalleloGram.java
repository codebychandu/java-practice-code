package Basic;

import java.util.Scanner;
// area of a parallelogram = area=(d1*d2)
public class ParalleloGram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the one side value");
        int d1=sc.nextInt();
        System.out.println("Enter the second side value");
        int d2 = sc.nextInt();
        int area=(d1*d2);
        System.out.println("Area of a parallelogram is: " + area);
        sc.close();

    }
}