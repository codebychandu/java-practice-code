import java.util.Scanner;

public class linearSearch {

    static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int linearSr1(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                System.out.print("Given target is avilable on index: ");
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];

        System.out.println("Enter the all array element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the targe value: ");
        int target = sc.nextInt();
        System.out.println("Given array: ");
        printArray(arr);
        int ans = linearSr1(arr, target);
        System.out.print( ans);


        sc.close();
    }
    
}
