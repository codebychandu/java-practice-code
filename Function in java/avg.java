

//Enter 3 numbers from the user & make a function to print their average.



import java.util.*;
public class avg  {

        public static int avarage(int a, int b , int c){
            int avg = (a + b + c)/3;
            return avg;
        }


        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        int avg = avarage(a, b, c);
        System.out.print("Average of the three number is: " + avg);

        sc.close();

    }
}