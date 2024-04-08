import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to add: ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < a; ) {
            sum = sum + (a % 10) ;
            a = a / 10;
            
        }
        System.out.print("Sum of all number is: " + sum);

        sc.close();
    }
    
}
