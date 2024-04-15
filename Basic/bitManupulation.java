package Basic;

// import java.util.Scanner;

// public class bitManupulation {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         System.out.println("Enter the position: ");
//         int b = sc.nextInt();

//         // And logic
//         int bit = a<<b;
//         if ((bit & a) == 0){
//             System.out.println("bit  is zero");
//         }
//         else{
//             System.out.println("bit is one");
//         }

//         // OR logic
//         int NewNumbr = bit | a;
//         System.out.println(NewNumbr);


//         sc.close();

//     }
    
// }



import java.util.*;


public class bitManupulation {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int oper = sc.nextInt();
       // oper=1 -> set; oper=0 -> clear
      int n = 5;
      int pos = 1;
     
      int bitMask = 1<<pos;
      if(oper == 1) {
          //set
          int newNumber = bitMask | n;
          System.out.println(newNumber);
      } else {
       //clear
       int newBitMask = ~(bitMask);
       int newNumber = newBitMask & n;
       System.out.println(newNumber);
      }

      sc.close();
     
   }
}
