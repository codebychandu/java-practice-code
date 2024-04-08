import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int i=0,table;
        while (i <10) {
            i++;
            table = a*i;
            System.out.println(a+ "*" + i+ "=" + table);
        }
        sc.close();
    }
}