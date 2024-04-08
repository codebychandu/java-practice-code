import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    static void sortarray(int arr[]){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int a = sc.nextInt();
        System.out.println("Enter the all array element: ");
        int [] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sortarray(arr);
        sc.close();
    }
}
