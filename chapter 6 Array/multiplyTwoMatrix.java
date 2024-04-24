
//Question:  Write a program to display Multiplication of two matrices entered by the user.    

import java.util.Scanner;

public class multiplyTwoMatrix {

    static void printMatrix(int[][] arr1){
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void TwoMatrix(int[][] arr1, int a, int c, int[][] arr2, int b, int d){
        if (b != c) {
            System.out.println("Multiplication is not possible- wrong daimention");
        }

        int[][] mul = new int[a][d];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < d; j++) {
                for (int k = 0; k < b; k++) {
                    /*
                     * i =0, j = 0;
                     * mul[i][j] = ith row of a * jth column 
                     */
                    mul[i][j] +=  (arr1[i][k] * arr2[k][j]); 
                }
            }
        }
        System.out.println("Multiplication of two matrix: ");
        printMatrix(mul);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] arr1 = new int[a][b];
        System.out.println("Enter the " + a * b + " elements: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the second number of rows and columns");
        int c = sc.nextInt();
        int d = sc.nextInt();

        int[][] arr2 = new int[c][d];
        System.out.println("Enter the " + c * d + " elements: ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("This is the first matrix: ");
        printMatrix(arr1);
        System.out.println("This is the second matrix: ");
        printMatrix(arr2);

        TwoMatrix(arr1, a, c, arr2, b, d);

        sc.close();

    }
    
}
