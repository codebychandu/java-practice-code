import java.util.Scanner;

public class calculator {
public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the first no:");
        int x = sc.nextInt();
        System.out.print("Enter the second no:");
        int y = sc.nextInt();
        int sum,sub,mul,div;
        sum=x+y;
        sub=x-y;
        mul=x*y;
        div=x/y;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
    }
}