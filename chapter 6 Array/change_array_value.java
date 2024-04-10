import java.util.Scanner;

public class change_array_value {

    static void change(int[] arr) {
        arr[0] = 5;

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int arr[] = new int[a];
            int i;
            for (i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            change(arr);
            for (int element : arr) {
                System.out.print(element + " ");
            }
        }

    }
}
