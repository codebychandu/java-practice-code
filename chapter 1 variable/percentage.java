import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("enter the english marks");
            int e = sc.nextInt();
            System.out.println("enter the hindi marks");
            int h = sc.nextInt();
            System.out.println("enter the math marks");
            int m = sc.nextInt();
            System.out.println("enter the physics marks");
            int p = sc.nextInt();
            System.out.println("enter the chemistry marks");
            int c = sc.nextInt();
            float per = (e + h + m + p + c) / 500.0f * 100;
            System.out.println("you got " + per + " percentage in exam");
        }
    }
}
