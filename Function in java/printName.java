
// print your name by using function and take input from the user.


import java.util.*;
public class printName {

    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();

        printMyName(name);

        sc.close();
    }
}