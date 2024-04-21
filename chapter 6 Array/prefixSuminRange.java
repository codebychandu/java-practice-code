

/*Questions:  Given an array of intergers of size n. Answer q queries where you need to print the sum of
values in a given range of indices from l to r (both included)
Note: The values of l and r in queries follow 1-based indexing.
*/
import java.util.Scanner;

public class prefixSuminRange {

    static void printArray(int arr[]){
        int a = arr.length ;
        for (int i = 1; i < a ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] printSuminrange(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n + 1];

        System.out.print("Enter the array elements: ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array is: ");
        printArray(arr);

        int[] pref = printSuminrange(arr);

        System.out.println("Enter the queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.print("Enter the range: ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = pref[r] - pref[l-1];
            System.out.println("Sum is: " + ans);
        }

        sc.close();
    }    
}
