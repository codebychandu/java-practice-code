
// 1) Find the unique number in a given array where all the elements are being repated  twice with one value being unique.


import java.util.Scanner;

public class  findUnique{

    static int unique(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: "); // input: 5
        int a  = sc.nextInt();
        int [] arr = new int[a];
        System.out.printf("Enter the %d elements of array: ",a); //Input Array: 1 2 2 1 3
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = sc.nextInt();

        }
        System.out.print("Unique no is: "); // output: 3
        System.out.println(unique(arr));



        sc.close();
    }    
}
