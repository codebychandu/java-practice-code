

// Write an infinite loop using do while condition.

import java.util.*;
public class infiniteLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        // if you will give input as a '0' if will become infinite loop
        int i = 1;
        do{
            System.out.println(i+ "Chandu kumar");
            i++;
        }while(i>a);


        sc.close();
    }
}