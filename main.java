import java.util.*;

public class main {
    public static void Main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int element : arr) {
            System.out.println(element);
        }
        sc.close();
    }
}