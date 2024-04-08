import java.util.Scanner;

public class maxvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter the %d value: ", i);
            arr[i] = sc.nextInt();
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.print("Max value is: "+ ans);

        sc.close();

    }
    
}
