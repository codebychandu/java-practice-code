import java.util.Scanner;

public class find_number {

    public static int arrayfind(int[] arr, int x){
        int count=0; 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
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
        System.out.print("Enter the number: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x : ");
        int x = sc.nextInt();
        
        System.out.println("you number is : "+arrayfind(arr,x));

        sc.close();
    }
    
}
