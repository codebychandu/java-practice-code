import java.util.Scanner;

public class searchInArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];

        int c;
        for (int i = 1; i <= arr.length; i++) {
            System.out.printf("Enter the %d value: ", i);
            arr[i] = sc.nextInt();
            c = arr[i];
            System.out.print("Your Number is: " + c);

        }

        // System.out.print("Enter the number you want to search: ");
        // int b = sc.nextInt();

        // for (int j = 0; j < arr[i]; j++) {
        //     if(arr[i]==b){
        //         System.out.printf("Value is present on %d index value" , i);
        //         break;
                
        //     }
            
        // }

        sc.close();
    }
    
    
}
