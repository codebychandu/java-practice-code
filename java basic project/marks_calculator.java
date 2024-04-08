import java.util.Scanner;

public class marks_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the math marks: ");
        int math=sc.nextInt();
        System.out.println("Enter the Physics marks: ");
        int phy=sc.nextInt();
        System.out.println("Enter the Chemistory marks: ");
        int Chemistory=sc.nextInt();
        System.out.println("Enter the English marks: ");
        int English=sc.nextInt();
        System.out.println("Enter the Hindi marks: ");
        int Hindi=sc.nextInt();
        float total_marks = math + phy + Chemistory + English + Hindi;
        System.out.println("your total marks is: " + total_marks);
        float percentage=total_marks/5;
        System.out.println("you got " + percentage + "percentage of marks in your exam");
        sc.close();
    }
}