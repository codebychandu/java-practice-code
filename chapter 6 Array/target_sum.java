
// Find a total number of pairs in the array whose sum is equal to a given value x.

import java.util.Scanner;

public class target_sum {
    static int pairSum(int arr[] , int target){
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {  // first number
            for (int j = i+ 1; j < n; j++) { // second number
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        System.out.println(pairSum(arr, target));


        sc.close();
    }
    
}
