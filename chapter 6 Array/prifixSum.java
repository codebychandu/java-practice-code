


//Question:- Given an integer 'a', return the prefix sum/running sum in the same array without creating a new array

import java.util.Scanner;

public class prifixSum {

        static void printArr(int[] arr){
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // static int[] prifix(int[] arr){
        //     int n = arr.length;
        //     int[] pre = new int[n];
        //     pre[0] = arr[0];
            
        //     for (int i = 1; i < n; i++) {
        //         pre[i] = pre[i - 1] + arr[i];
        //     }
        //     return pre;
        // }


        //  without creating a new array
        static int[] prifix(int[] arr){
            int n = arr.length;
            
            for (int i = 1; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i];
            }
            return arr;
        }

        // write the code for suffix sum of array
            // cdoe ...
     

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int  a = sc.nextInt();
        int[] arr = new int[a];

        System.out.print("Enter the" + a + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array is: ");
        printArr(arr);

        int[] pre = prifix(arr);
        System.out.print("Sum of prefix is: ");
        printArr(pre);

        sc.close();
    }
    
}
