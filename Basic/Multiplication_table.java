package Basic;

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No you want to Print the table: ");
        int m=sc.nextInt();
        int n=10;
        for(int i=1; i<=n; i++){
            System.out.println(m+ "*" + i + "="+ m*i);
        }
        sc.close();
    }
}