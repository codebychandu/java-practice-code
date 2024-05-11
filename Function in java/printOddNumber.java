

import java.util.Scanner;
public class printOddNumber {
    public static void printOdd(int a){
        for (int i = 1; i <= a; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
            
        }
    }
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            printOdd(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // In this given example below there is resources leak problem occuring even added sc.close();
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // printOdd(a);
        // sc.close();

    }
    
}
