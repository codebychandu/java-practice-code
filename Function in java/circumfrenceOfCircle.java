//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class circumfrenceOfCircle {

    //  perimeter = 2 · π · r
    public static void circle(double r){
        double perimeter = 2 * Math.PI * r;
        System.out.println(perimeter);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius Number: ");
        double r = sc.nextInt();

        circle( r);

        sc.close();
    }
}