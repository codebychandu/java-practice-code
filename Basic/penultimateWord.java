package Basic;

import java.util.Scanner;

public class penultimateWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = in.nextLine();
        String[] words = line.split("[ ]+");
        System.out.println("Penultimate word: " + words[words.length - 2]);

        in.close();
    }
}
