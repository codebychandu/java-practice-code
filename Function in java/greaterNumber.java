
//Write a function which takes in 2 numbers and returns the greater of those two.


import java.util.*;
public class greaterNumber {

    public static void greaterNum(int a, int b){
        if(a>b){
            System.out.println("Greater number is: "+ a);
        }
        else{
            System.out.print("Greater number is: " + b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        greaterNum(a,b);

        sc.close();
    }
}