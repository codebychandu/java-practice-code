// package classes_and_object;

//program 1

// public class main1 {
//     public static void main(String args[]) {
//         System.out.println(args[0]);
//         System.out.println(args[1]);
//         System.out.println(args[2]);
//         System.out.println(args[3]);
//         System.out.println(args[4]);
//     }
    
// }

// program 2

public class main1{
    public static void main(String[] args) {
        int s=0 , p;
        for (int i = 0; i < args.length; i++) {
            // System.out.print(args[i] + " ");
            // System.out.println();
            // System.out.print(args[0] + " ");

            s = s+Integer.parseInt(args[i]);
            p = s /3;
            System.out.println(p);
        }

    }
}
