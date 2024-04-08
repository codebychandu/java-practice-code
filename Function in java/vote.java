
//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.*;
public class vote {

    public static void eligiblePerson(int a){
        if(0<= a && a<= 17){
            System.out.println("You are kid, you can't vote.");
        } else {
            System.out.println("You are young, you can vote");
        }
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the person age: ");
        int a = sc.nextInt();

        eligiblePerson(a);

        sc.close();
    }
}