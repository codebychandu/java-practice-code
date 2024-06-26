

// Question 1: insert a new value into the given position.

// import java.util.Scanner;
// public class InsertArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array: ");
//         int a = sc.nextInt();
//         int[] arr = new int[a+1];
//         System.out.println("Enter the all array element: ");
//         for (int i = 0; i < a; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter the index: ");
//         int index = sc.nextInt();
//         System.out.println("Enter the value: ");
//         int value = sc.nextInt();
//         for (int i = a; i > index; i--) {
//             arr[i] = arr[i-1];
//         }
//         arr[index] = value;
//         a++;
//         System.out.println("Updated Array is: " );
//         for (int i = 0; i < arr.length ; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         sc.close();
//     }
    
// }

// Questions 2: Develop a program in java to Change the kth element in the array with the given number

import java.util.Scanner;

public class InsertArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int a = sc.nextInt();
        System.out.println("Enter the all array element: ");
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the position: ");
        int k = sc.nextInt();
        System.out.println("Enter the value: ");
        int element = sc.nextInt();
        if (k <= 0 || k > a) {
            System.out.print("-1");

        }else{
            arr[k - 1] = element;
            System.out.print("Updated Array is: ");
            for(int i=0; i<a; i++){
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}