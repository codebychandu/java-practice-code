import java.util.Scanner;

public class addTwoMatrix {

    static void printMatrix(int[][] arr1){
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void add(int[][] arr1, int a, int b, int[][] arr2, int c, int d){
        if (a != c || b != d) {
            System.out.println("Wronge value enter, enter same row and column");
            return;
        }

        int[][] sum = new int[a][c];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = arr1[i][j] + arr2[c][d];
            }
        }
        printMatrix(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two size of number a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] arr1 = new int[a][b];
        System.out.println("Enter the matrix value: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the c and d value for second matrix: ");
        int c = sc.nextInt(); 			//c=2;d=3; //
        int d = sc.nextInt();
        int [][] arr2 = new int[c][d];
        System.out.println("Enter the matrix value: ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("First Matrix is: ");
        printMatrix(arr1);
        System.out.println("Second Matrix is:  ");
        printMatrix(arr2);
        
        add(arr1, a, b, arr2, c, d);

        sc.close();
    }
    
}
