package Basic;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // area of rectangle is = length * breadth
        System.out.println("Enter the length of the rectangle: ");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        int b=sc.nextInt();
        int rectangle=l*b;
        System.out.println("Area of the rectangle is: ");
        System.out.println(rectangle);
        sc.close();

    }
}