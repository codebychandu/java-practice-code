import java.util.*;

public class demo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i+= 2) {
            sum += i;
        }
        System.out.print(sum);


        

    

        sc.close();
    }

    
}
 