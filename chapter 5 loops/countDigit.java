import java.util.*;
public class countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to count: ");
        int num = sc.nextInt();
        int original = num;
        int digit = 1;
        for (int i = 0; i <= num; i++) {
            num = num / 10 ;
            digit++;
            
        }
        System.out.println("Digit of "+ original + " is: " +digit);

        sc.close();
    }
}