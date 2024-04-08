import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to print the table: ");
        int a = sc.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(a + " * " + i + " = " + a*i);
        }
        sc.close();
    }
}