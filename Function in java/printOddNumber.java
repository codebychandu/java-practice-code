import java.util.Scanner;

public class printOddNumber {

    public static void printOdd(int a){
        for (int i = 1; i <= a; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
            
        }
        // return;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        printOdd(a);


        sc.close();

    }
    
}
