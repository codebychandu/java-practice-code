package Basic;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String s = sc.nextLine();
        switch (s) {

            case "mango":
                System.out.println("King of fruit");
                break;
            case "apple":
                System.out.println("A sweet fruit");
                break;
            case "grapes":
                System.out.println("A sweet green fruit");
                break;
            default:
                System.out.println("please enter the correct fruit name");
                break;
        }
        sc.close();
    }
    
} 
