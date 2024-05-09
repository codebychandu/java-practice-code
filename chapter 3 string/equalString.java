
// Program to compare if two strings are equal or not ignoring the case.

import java.util.*;
public class equalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            if (s1.equalsIgnoreCase(s2)) {
                System.out.println("String are equals");
            }else{
                System.out.println("String are not equals");
            }
        }


        sc.close();
        
    }
    
}
