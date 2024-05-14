
import java.util.*;
public class mainClass {

    static int cylilnder(int r, int h){
        // Area of a Cylinder = A = 2πr^2 + 2πrh
        double area = 2 * Math.PI * r * r + 2 * Math.PI * h;
        return (int) area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius value: ");
        int r = sc.nextInt();
        System.out.println("Enter the height value: ");
        int h = sc.nextInt();
        System.out.println("Area of Cylinder is: " + cylilnder(r, h));

        sc.close();
    }
    
}
