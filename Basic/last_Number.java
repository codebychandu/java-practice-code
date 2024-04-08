import java.util.Scanner;

public class last_Number {

    static int Lastnumberfind(int arr[] , int x){
        int last= -1; 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                last = i;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the number ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Number you want to search: ");
        int x =  sc.nextInt();

        System.out.println("Your number is place on index " + Lastnumberfind(arr, x));



        sc.close();
    }
    
}
