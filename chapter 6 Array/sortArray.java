

// 1)  Sort an array

// import java.util.Arrays;
// import java.util.Scanner;

// public class sortArray {
//     static void sortarray(int arr[]){
//         Arrays.sort(arr);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array: ");
//         int a = sc.nextInt();
//         System.out.println("Enter the all array element: ");
//         int [] arr = new int[a];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         sortarray(arr);
//         sc.close();
//     }
// }



// 2) Sort an array consisting of only 0's ans 1's : ex:- 110100101


import java.util.Scanner;

public class sortArray{

    static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 1st way

    // static void sortZeroandone1(int[] arr){
    //     int n = arr.length;
    //     int zeroes = 0 ;
    //     // count number of zeros
    //     for (int i = 0; i < n; i++) {
    //         if (arr[i] == 0) {
    //             zeroes++;
    //         }
    //     }
    //     // System.out.println(zeroes);
    //     // our Target --> 0 to zeroes - 1: 0, and zeroes to n - 1: 1
    //     for (int i = 0; i < n; i++) {
    //         if (i < zeroes) {
    //             arr[i] = 0;
    //         }else{
    //             arr[i] = 1;
    //         }
    //         System.out.print(arr[i] + " ");
    //     }
    // }


    // 2nd way: it's better approach because there is only one traversal and it's called Dutch National Flag algorithm
        // static void sortZeroandone2(int[] arr){
        //     int n = arr.length;
        //     int left = 0, right = n-1;
        //     while (left < right) {
        //         if (arr[left] == 0) {
        //             left++;
        //         }
        //         if (arr[right] == 1) {
        //             right--;
        //         }
        //         if (arr[left] == 1 && arr[right] == 0) {
        //             swap(arr, left, right);
        //             left++;
        //             right--;

        //         }
        //     }    
        // }

        /* question:- Given an array of integers 'a' move all the even integers
            at the beginning of the array followed by all the odd integers. 
            The relative order of odd or even integer does not matter. Return any
            array that satsfies the condition.
            */
        static void sortArraybyParity(int[] arr){
            int n = arr.length;
            int left = 0, right = n - 1;
            while (left < right) {
                if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                    swap(arr, left, right);
                    left++;
                    right--;
                }
                if (arr[left] % 2 == 0) {
                    left++;
                }
                if (arr[right] % 2 == 1) {
                    right--;
                }
            }

        }

        // static void sortZeroandone2(int[] arr) {
        //     int n = arr.length;
        //     int left = 0, right = n - 1;
        //     while (left < right) {
        //         if (arr[left] == 0) {
        //             left++;
        //         } else if (arr[right] == 1) {
        //             right--;
        //         } else {
        //             swap(arr, left, right);
        //             left++;
        //             right--;
        //         }
        //     }
        // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int a = sc.nextInt();
        int [] arr = new int[a];

        System.out.print("Enter the " + a + " array element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array is: ");
        printArray(arr);
        System.out.println("Sorted Array is: ");
        sortArraybyParity(arr);
        // sortZeroandone1(arr);
        // sortZeroandone2(arr);
        printArray(arr);


        sc.close();
    }
}

