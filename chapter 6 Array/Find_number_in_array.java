import java.util.Scanner;

public class Find_number_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int a = sc.nextInt();
        int [] arr = new int[a];
        // int i = 0;
        for (int i = 0; i < a; i++) {
        System.out.println("Enter number " + (i + 1) + " of " + a + ": ");
        arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number for search");
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < a; i++) {
            if(arr[i] == target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println(target+ " is present in the given array");
        }else{
            System.out.println(target + " is not present in the given array");
        }
        sc.close();
    }
}