import java.util.Scanner;

public class FirstRepeatingvalue {
     
    static int Repeating(int[] arr){
        int n = arr.length;
        for ( int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
               if (arr[i] == arr[j]) {
                    return arr[i];
               } 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];

        System.out.print("Enter the all array element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Repeating no is: ");
        System.out.println(Repeating(arr));

        sc.close();
    }
    
}
