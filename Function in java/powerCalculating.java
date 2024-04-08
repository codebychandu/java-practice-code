

/* Two numbers are entered by the user, x and n.
 Write a function to find the value of one number raised to the power of another.
 i.e. xn
 
 */ 

 import java.util.*;
 public class powerCalculating {

    public static void power(double x , double n){
        System.out.println("Your power value is: "  +Math.pow(x,n));

        return ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        double x = sc.nextInt();
        System.out.print("Enter the second valre: ");
        double n = sc.nextInt();

        power(x,n);


        sc.close();
    }
 }