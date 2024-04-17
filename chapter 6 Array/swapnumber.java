

// Question: Reverse the array consisting of integer value

// import java.util.Arrays;
// import java.util.*;

// public class swapnumber {

//     static void swapindex(int[] arr, int index1, int index2){
//         int temp = arr[index1];
//         arr[index1] = arr[index2];
//         arr[index2] = temp;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Value given by default
//         // int[] arr = {1, 3 ,23, 8, 9};

//         // Value taken from the user
//         System.out.println("Enter the size of array: ");
//         int a = sc.nextInt();
//         int [] arr = new int[a];

//         System.out.println("Enter the array: ");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter the first index: ");
//         int index1 = sc.nextInt();
//         System.out.println("Enter the second index: ");
//         int index2 = sc.nextInt();

//         // index given by default
//         // swapindex(arr, 0,3);

//         // Index value taken from the users
//         swapindex( arr, index1, index2);
//         System.out.println(Arrays.toString(arr));

//         sc.close();
//     }


// }

// Second way to solve this question


import java.util.*;

public class swapnumber {

    static void swapArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reversedArray(int[] arr){
        int i= 0, j = arr.length - 1;
        while (i<j) {
            swapArray(arr, i, j);
            i++;
            j--;
        }
        // Print the reversed array
       System.out.println("Reversed Array:");
       for ( i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int a = sc.nextInt();
        int [] arr = new int[a];

        System.out.println("Enter the all Array element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        reversedArray(arr);
      
        sc.close();
    }
}
