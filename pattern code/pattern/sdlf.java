import java.util.*;
public class sdlf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int b = a;
            for (int j = 0; j < i + 1; j++) {
                System.out.print(b-- + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}