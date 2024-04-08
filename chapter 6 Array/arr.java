// // 1) take the input in array and print

// import java.util.*;
// public class arr {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int [] marks = new int[a];
//         // int marks1[] = {1, 2,3 , 4, 5};
//         // marks[0] = 1;
//         // marks[1] = 2;
        
//         // input
//         for (int i = 0; i < marks.length; i++) {
//             marks[i] = sc.nextInt();
//         }

//         // output
//         for (int j = 0; j < marks.length; j++) {
//             System.out.println(marks[j]);
//         }
//         // System.out.println(marks[i]);

//         sc.close();
//     }
// }


// 2) take an array as input from the user. Search for a given number x and print the index at which it occurs. 

// import java.util.*;
// public class arr {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int arr[] = new int[a];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter the number x: ");
//         int x = sc.nextInt();

//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i] == x){
//                 System.out.println("number found");
//                 break;
//             }
//         }
//         System.out.println();
//     }
// }


// 3) Find the maximum & minimum number in an array of integers.


    //1st way


// import java.util.*;
// public class arr {
//     // public static void main(String[] args) {

//     //     Scanner sc = new Scanner(System.in);
//     //     int a = sc.nextInt();
//     //     int arr[] = new int[a];
//     //     for (int i = 0; i < arr.length; i++) {
//     //         arr[i] = sc.nextInt();
//     //     }
//     //     int max =  Integer.MIN_VALUE;
//     //     int min = Integer.MAX_VALUE;
//     //     for (int i = 0; i < arr.length; i++) {
//     //         if(arr[i] < min){
//     //             min = arr[i];
//     //         }
//     //         if(arr[i] > max){
//     //             max = arr[i];
//     //         }
//     //     }
//     //     System.out.println("Smallest number is: "+min);
//     //     System.out.println("Largest number is: "+max);

//     //     sc.close();
//     // }


        // 2nd Way


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of array: ");
//         int a = sc.nextInt();
//         int arr[] = new int[a];
//         System.out.print("Enter the all array number: ");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         Arrays.sort(arr); 
//         System.out.print("Sorted array is: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         int firstNum = arr[0];
//         int lastNum = arr[arr.length-1];

//         System.out.println("Min value is:  " + firstNum);
//         System.out.println("Max value is:  " + lastNum);

//         sc.close();
//     }
// }


// 4) Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.*;
public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // boolean isAscending = true;
        int sorted = 0;
        int notSorted = 0;
        for(int i=0; i<arr.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
            if(arr[i] > arr[i+1]) { // This is the condition for descending order
                // isAscending = false;
                sorted = arr[i];
            }
            if(arr[i] < arr[i+1]) { // This is the condition for descending order
                notSorted = arr[i];
                // isAscending = false;
            }
            
        }
        System.out.println("Array is not sorted: " + sorted);
        System.out.println("Array is sorted: " + notSorted);
 
 
        // if(isAscending) {
        //     System.out.println("The array is sorted in ascending order");
        // } else {
        //     System.out.println("The array is not sorted in ascending order");
        // }
 



        sc.close();
    }
}