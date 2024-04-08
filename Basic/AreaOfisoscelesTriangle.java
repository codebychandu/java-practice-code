package Basic;

import java.util.Scanner;
/*What is an isosceles triangle?

An isosceles triangle is a triangle where any two sides of a triangle
should be equal both in terms of length and angles
*/
public class AreaOfisoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a value: ");
        double a=sc.nextDouble();
        System.out.print("Enter the b value: ");
        double b=sc.nextDouble();
        double area=(b/4)*Math.sqrt((4*a*a)-(b*b));
        System.out.print("Area of the isosceles triangle is: ");
        System.out.println(area);
        sc.close();
    }
    
}
