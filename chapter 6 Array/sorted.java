import java.util.Scanner;

public class sorted {

    static void checksortedarray(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[i+1]){
                System.out.println("Array is not sorted");
                
            }
            else{
                System.out.println("Array is sorted");
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr  = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        checksortedarray(arr);
        // System.out.print(checksortedarray(arr));


        sc.close();
    }
    
}
