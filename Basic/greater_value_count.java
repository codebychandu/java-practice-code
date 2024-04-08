import java.util.Scanner;

public class greater_value_count {

    static int greatervaluecount(int arr[] , int x){
        int count = 0; 
        System.out.println("your greater number is: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the all number: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the x number: ");
        int x = sc.nextInt();

        System.out.println(greatervaluecount(arr, x));


        sc.close();
    }
}
