package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class addMultiArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialize the arraylist of integer arrays
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());

        }

        // Add the element
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(j).add(sc.nextInt());
            }
        }



        sc.close();
        
    }
    
}
