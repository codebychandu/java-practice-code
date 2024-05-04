

//questions1: transform the matrix 

import java.util.Scanner;

public class transposeMatrix {

    static void printMatrix(int[][] arr, int rows, int cols){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    // 1st way to transform the matrix.
    static void transpose(int[][] arr, int rows, int cols){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
    // 2nd way: to transform the matrix.
    static void transpose1(int[][] arr, int rows, int cols){
        for (int i = 0; i < cols; i++) {
            for (int j = i; j < rows; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            // System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row value:");
        int rows = sc.nextInt();
        System.out.println("Enter the column value:");
        int cols = sc.nextInt();
        System.out.println("Enter the matrix value:");
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your Matrix value is: ");
        printMatrix(arr, rows, cols);
        System.out.println("Transpose Matrix value is: ");
        // transpose(arr, rows, cols);
        transpose1(arr, rows, cols);
        printMatrix(arr, rows, cols);
        
        sc.close();
    }

}
