import java.util.Scanner;

public class arrayMaxValue {


    // This fuction help to identify max value from a given number
    static int max(int[] arr) {
        int maxval = arr[0];
        for (int i=1; i<arr.length; i++) {
        if (arr[i] > maxval) {
            maxval = arr[i];
        }
    }
    return maxval;
    }

    // Max value from the given range
    static int maxRange(int[] arr, int start, int end){
        int maxvalue = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxvalue) {
                maxvalue = arr[i];
            }
        }
        return maxvalue;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 5, 8, 9};
        System.out.println("Max value from intire given value: ");
        System.out.println(max(arr));
        System.out.println("Max value from given range: ");
        System.out.println(maxRange(arr, 0, 2));


        sc.close();
    }
}


