import java.util.Scanner;

public class string_to_lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String b = s.toLowerCase();
        System.out.println(b);
        System.out.println(s.replace(' ', '_'));
        sc.close();
    }
}