package Basic;

public class operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // b = a++;
        // System.out.printf("%d%d\n ", a, b);

        b = ++a;
        System.out.printf("%d%d\n", a, b);
    
        b = --a;
        System.out.printf("%d%d\n", a, b);

        b = a--;
        System.out.printf("%d%d\n", a, b);

    }
    
}

// logical operator  ( And= &&, or = ||, not !=)
// operator + , * , / ,- , = 
// increment and decrement operatot( a++, ++a, --a , a--)
// Assinment opperator (+=, -=, >=, <=, *=, /=, =)
// Binary number system ( 0, 1 )
// bitwise operator ( >>, << , &, | , !)
