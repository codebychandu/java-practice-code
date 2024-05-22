package Basic;

import java.util.Scanner;
public class CaptialLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentance:"); //input:  the quick brown fox jumps over the lazy dog.
        String originalString = sc.nextLine();
        String replaceString = originalString.replaceAll("\\s{2,}", " ").trim();
        String[] words = replaceString.split(" ");
        for (String string : words) {
            System.out.print(string.substring(0,1).toUpperCase()+string.substring(1,string.length())+ " ");
        }
        // output: The Quick Brown Fox Jumps Over The Lazy Dog.


        sc.close();

    }
}
