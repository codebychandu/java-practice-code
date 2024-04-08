import java.util.Scanner;

public class kilo_to_mile {
    public static void main(String[] args){
        System.out.println("Enter the kilometer");
        try (Scanner Scanner = new Scanner(System.in)) {
            float miles = 0.62137119f;
            float kilo = Scanner.nextInt();
            float convert = kilo * miles;
            System.out.println(convert);
        }
    }
}

// import java.util.Scanner;

// public class kilo_to_mile {
//     public static void main(String[] args){
//         System.out.println("Enter the kilometer");
//         Scanner scanner = new Scanner(System.in);
//         float miles = 0.62137119f;
//         float kilo = scanner.nextInt();
//         float convert = kilo * miles;
//         System.out.println(convert);
//     }
// }
