import java.util.Scanner;

public class pascalTraingle {
    static void printMatrix(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n){
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i+1];  
            ans[i][0]=ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        // int array[][] = new int[n][];
        // for (int i = 0; i < array.length; i++) {
        //     for (int j = 0; j < array.length; j++) {
        //         array[i][j] = sc.nextInt();
        //     }
        // }
        int [][] ans = pascal(n);
        printMatrix(ans);


        sc.close();

    }
    
}
