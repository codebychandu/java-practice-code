import java.util.Scanner;

public class passOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("");
        System.out.print("Enter Physics Subject marks: ");
        int a = sc.nextInt();
        System.out.print("Enter Chemistry Subject marks: ");
        int b = sc.nextInt();
        System.out.print("Enter Maths Subject marks: ");
        int c = sc.nextInt();
        System.out.print("Enter English Subject marks: ");
        int d = sc.nextInt();
        System.out.print("Enter Hindi Subject marks: ");
        int e = sc.nextInt();
        
        if(a >=30 && b>=30 && c>=30 && d>=30 && e>=30){
            // System.out.println(" Invalid number");
            int marks = a + b + c + d + e;
            if(marks >= 450){
                System.out.println("You got Top with A++ ");
            }else if(marks >= 400){
                System.out.println("you got 1st devision with A+ grade" );
            }else if( marks >= 300){
                System.out.println("you got 1st devision with A grade");
            }
            else{
                System.out.println("You got pass marks");
            }
        }else{
            System.out.println(" You are Fail");
        }
        sc.close();
    }
}