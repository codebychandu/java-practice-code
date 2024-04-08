
// // basic of 'StringBuilder'


// // import java.util.Scanner;

// public class StringBuilder1 {
//     public static void main(String[] args){
//         // Scanner sc1 = new Scanner(System.in);
//         // String a = sc1.nextLine();
//         StringBuilder sc = new StringBuilder("Tony");

//         // print the index value with 'charAt'
//         System.out.println(sc.charAt(0));

//         // change the char of index with 'setchatAt'
//         sc.setCharAt(0, 'C');
//         System.out.println(sc);

//         // add char on index with 'index'
//         sc.insert(0, 'S');
//         System.out.println(sc);

//         // delect extra char with 'delect'
//         sc.delete(2, 3);
//         System.out.println(sc);

//         // add some char in the last
//         sc.append("s"); // for String  str = str + "s" 
//         sc.append("t");
//         sc.append("a");
//         sc.append("r");
//         sc.append("k");
//         System.out.println(sc);// output SCnystartk (this output i am getting in stringbulder)
        
//         //  find the length of the string using 'length'
//         System.out.println(sc.length());




//         // sc1.close();

//     }
    
// }




// 2nd question:-  reverse the string

// public class StringBuilder1 {

//     public static void main(String[] args) {
//         StringBuilder sc = new StringBuilder("chandu");
//         for (int i = 0; i < sc.length()/2; i++) {
//             int  front = i;
//             int back = sc.length() - 1 - i;


//             char frontchar = sc.charAt(front);
//             char backchar = sc.charAt(back);

//             sc.setCharAt(front, backchar);
//             sc.setCharAt(back, frontchar);
//         }
//         System.out.println(sc);

//     }
// }
