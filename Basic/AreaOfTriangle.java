import java.util.Scanner;
// area of triangle = (1/2) · b · h
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle");
        int b=sc.nextInt();
        System.out.println("Enter the height of the triangle");
        int h=sc.nextInt();
        int t=(b*h)/2;
        System.out.println("Area of Triangle is: ");
        System.out.println(t);
        sc.close();
    }
}