

 /*
  Creat a class Game , which allows the user to play a game"Guess a number" 
  game once. Game should have the following methods.
  1. Constructor to generate a random number
  2. takeuserinput() to take user input of number
  3. iscorrectnumber() to detect whether a number is enterd by the user is true.
  4. getter or setter of number of users.
 */

import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int inputnumber;
    public int noofguesses = 0;
    

    public int getnoofguesses(){
        return noofguesses;
    }
    public void setnoofguess(int noofguesses){
         this.noofguesses = noofguesses;
    }

    game(){
        Random ran = new Random();
        this.number = ran.nextInt(100);
    }
    void takeuserinput(){
        System.out.println("Guess the number");
        try (Scanner sc = new Scanner(System.in)) {
            inputnumber = sc.nextInt();
        }

        // sc.close();
    }
    boolean iscorrectnumber(){
        noofguesses++;
        if(inputnumber == number){
            System.out.printf("Yes you guessed it right , number was %d\nyou guessed it in %d attempts", number, noofguesses);
            return true;
        }
        else if(inputnumber < number){
            System.out.println("too low...");
        }
        else if(inputnumber > number){
            System.out.println("too high...");
        }
        return false;
        
    }
}

public class GuessGame {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while (!b) {
            g.takeuserinput();
            b = g.iscorrectnumber();    
            System.out.println(b);
        }
        
    }
    
}
