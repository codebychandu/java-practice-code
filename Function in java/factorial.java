import java.util.*;
public class factorial {

    public static int factorialcalculate(int n){
        int fact = 1;
        for (int i = n; i>= 1; i--) {
            fact = fact *i;
            
        }
        // System.out.println(fact);
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int fact = factorialcalculate(n);
        System.out.println("Factorial of " + n + " is: " + fact);
        sc.close();
    }
}