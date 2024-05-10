import java.util.Scanner;

public class nthOccurenceIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the number: ");
        char ch = sc.next().charAt(0);

        int count = 0;
        int index = -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
                if (count == n) {
                    index = i;
                    break;
                }
            }
        }
        if (index >= 1) {
            System.out.println(index);
        }
        else {
            System.out.println(-1);
        }

        sc.close();
    }
    
}
