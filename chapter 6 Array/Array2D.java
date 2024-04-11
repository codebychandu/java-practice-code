
// 1) undefined column print 
// public class Array2D {
//     public static void main(String[] args) {

//         int arr[][] = {
//             {1, 2, 3, 4},
//             {5, 6},
//             {7, 8, 9}
//         };

//         for (int row = 0; row < arr.length; row++) {
//             for (int col = 0; col < arr[row].length; col++) {
//                 System.out.print(arr[row][col] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// 2) Take input from the user in 2D array, column should be undefined

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = sc.nextInt();

            int[][] arr = new int[rows][];

            // Taking input for each row
            for (int row = 0; row < arr.length; row++) {
                System.out.print("Enter the number of columns for row " + (row + 1) + ": ");
                int cols = sc.nextInt();
                arr[row] = new int[cols]; // Initialize the second dimension
                System.out.print("Enter " + cols + " elements for row " + (row + 1) + ": ");
                for (int col = 0; col < arr[row].length; col++) {
                    arr[row][col] = sc.nextInt();
                }
            }

            // Printing the 2D array
            System.out.println("The entered 2D array:");
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    System.out.print(arr[row][col] + " ");
                }
                System.out.println();
            }
        }

    }
}
