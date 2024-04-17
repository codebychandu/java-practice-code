


// Question: Roatate the array 'a' by k steps, where k in non-negative.
// Note: k can be greater than n as well.

import java.util.Scanner;

public class rotateArray {
    static int[] rotate(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n-k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n-k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int a = sc.nextInt();
        int [] arr = new int[a];

        System.out.println("Enter " +a+ " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the K value: ");
        int k = sc.nextInt();

        System.out.print("Original array: ");
        printArray(arr);
        int[] ans = rotate(arr,k);
        System.out.print("After  rotation the new array is: ");
        printArray(ans);

        sc.close();
    }
}
