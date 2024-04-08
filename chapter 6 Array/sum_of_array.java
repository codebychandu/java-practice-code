
// Create an array of 5 floats and calculate their sum


import java.util.Scanner;

public class sum_of_array {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // float[] s = new float[5];
        // float sum = 0;
        // for(int i=0; i<s.length; i++){
        //     s[i] = sc.nextFloat();
        //     sum = s[i] + sum;
        // }
        // System.out.println(sum);
        // sc.close();
    

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int age = sc.nextInt();
        int arr[] = new int[age];
        int sum = 0 ;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of Number is: " + sum);


        sc.close();
    }

}
