import java.util.*;
public class sumOfTwoNumber {
    public static int twonumber(int a, int b){
    
        int sum = (a + b);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int sum = twonumber(a,b);
        System.out.print("Sum of two number is: " + sum);

        sc.close();
    }
}