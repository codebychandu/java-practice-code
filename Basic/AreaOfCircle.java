package Basic;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // area of circle is = π · r2
        System.out.print("Enter the radius of circle: ");
        double r=sc.nextInt();
        double radius=3.1415 * r* r;
        System.out.print("Area of circle is: ");
        System.out.println(radius);
        sc.close();
    }
}