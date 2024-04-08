
// 1) Take the 2D array value and print as it is. 

// import java.util.Scanner;

// public class Array2D_array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the row size: ");
//         int row = sc.nextInt();
//         System.out.print("Enter the coloum size: ");
//         int cols = sc.nextInt();

//         System.out.println("Enter the row and coloums: ");
//         int[][] number = new int[row][cols];
//         for (int i = 0; i < number.length; i++) {
//             for (int j = 0; j < number.length; j++) {
//                 number[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Your row and coloum value is: ");
//         for (int i = 0; i < number.length; i++) {
//             for (int j = 0; j < number.length; j++) {
//                 System.out.print(number[i][j] + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }

// }

// 2) Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

import java.util.*;

public class Array2D_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;

        // To print spiral order matrix
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // 1
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            // 2
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;
            
            // 3
            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            // 4
            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;



            // System.out.println();
        }


        sc.close();
    }
}
