

/*Question:- Check if we can partition the array into two subarrays with equal sum. More formally
    check that the prefix sum of a part of the array is equal to the suffix sum of rest of the array.
*/

import java.util.Scanner;

public class equalPartitionArray {

    static int findArraysum(int[] arr){
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum = totalsum + arr[i];
        }
        return totalsum;
    }

    static boolean equalSumPartitionArray(int[] arr){
        int totalsum = findArraysum(arr);
        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum = prefSum + arr[i];
            int sufSum = totalsum - prefSum;
            if (prefSum == sufSum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];

        System.out.print("Enter the elements in Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Equal partition possible: " + equalSumPartitionArray(arr));



        sc.close();

    }    
}
