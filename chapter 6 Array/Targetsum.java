


// 1) Count the number of triplets whose sum is equal to the given to the x.

import java.util.Scanner;

public class Targetsum {

    static int triplesum(int arr[],int target){
        int n = arr.length ;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if(arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        
        System.out.println("Enter the Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum: ");
        int target  = sc.nextInt();

        System.out.print("Triple sum avilable in this array is: ");
        System.out.println(triplesum( arr, target));


        sc.close();
    }    
}
