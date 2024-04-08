import java.util.Scanner;

public class string_method{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the any name: ");
            String s=sc.next();
            System.out.println(s.length());

            // System.out.println(s.toLowerCase());
            // System.out.println(s.toUpperCase());
            // String c = "         Chandu  2    ";
            // System.out.println(c.trim());
            // System.out.println(s.substring(3,6));
            // System.out.println(s.replace('u', 'o'));
            // System.out.println(s.charAt(4));
            // System.out.println(s.indexOf('y'));
            System.out.println(s.indexOf('y',3));
        };
    }
}