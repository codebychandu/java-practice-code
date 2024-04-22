
// Taking input from the user and printing as it is.

import java.util.Scanner;

public class Multidaimentiona_array {
    static void printArray(int[][] flats){
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number: ");
        int r = sc.nextInt();
        System.out.println("Enter the column number: ");
        int c = sc.nextInt();

        // Already given value
        int [][] flats;
        flats = new int[r][c];
        // flats[0][0] = 101;
        // flats[0][1] = 102;
        // flats[0][2] = 103;
        // flats[1][0] = 201;
        // flats[1][1] = 202;
        // flats[1][2] = 203;

        
        // Value taken from the user and print as it is.
        System.out.println("Enter the" + r*c + "elements: ");
        for(int i =0; i<flats.length; i++){
            for(int j =0; j<flats[i].length; j++){
                flats[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array is: ");
        printArray(flats);

        sc.close();
    }
    
}
