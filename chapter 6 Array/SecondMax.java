import java.util.Scanner;

public class SecondMax {
    static int findmax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }
    static int findsecondmax(int[] arr){
        int mx = findmax(arr);
        int n =  arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int SecondMax = findmax(arr);
        return SecondMax;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.print("Enter the element of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(" Second max value is: ");
        System.out.println(findsecondmax(arr));
        

        sc.close();
    }
    
}
