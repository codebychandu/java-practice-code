
// Take input from the user in array.

import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // System.out.println("By taking input from the user");
            System.out.print("Enter the Array number: ");
            int a = sc.nextInt();
            int i;
            int flats[] = new int[a];
            for (i = 0; i < flats.length; i++) {
                System.out.printf("Enter the %d value: ", i);
                flats[i] = sc.nextInt();
            }
            System.out.println(i);

            
            sc.close();
        }
    }
}