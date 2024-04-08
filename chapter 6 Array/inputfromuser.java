
import java.util.*;
public class inputfromuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] b = new int[size];

        // System.out.println("Enter the value: ");
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the %d value: ", i);
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(" Your number is: "+b[i]);
        }



        sc.close();

    }
    
}
