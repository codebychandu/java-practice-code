
// Multiply the number of the given value


import java.util.*;
public class multiplyTwoNumber {

    public static int multiplynumber(int a, int b){
        int  mul = a*b;
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int mul = multiplynumber(a, b);
        System.out.print("Multiplication of the two number is: " + mul);

        sc.close();

    }
}