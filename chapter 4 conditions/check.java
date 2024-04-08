import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        if(a == 11){
            System.out.println("I am 11");
        }else{
            System.out.println("I am not 11");
        }
        sc.close();
    }
}