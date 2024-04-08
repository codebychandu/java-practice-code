import java.util.Scanner;

public class check_int {
    public static void main(String[] args){
        System.out.println("Enter the number");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(sc.hasNextInt());
        }

    }
}
