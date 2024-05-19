// package classes_and_object;

public class wrap {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt("123");
        System.out.println(x);   // 123 will print as a integer

        Integer x1 = Integer.parseInt("101010",2);
        int z = x1.intValue();
        System.out.println(z);  // 42 as a decimal value in object

        Double x2 = Double.valueOf("56");
        double y = x2.doubleValue();
        System.out.println(y);  // 56.0 as a double value


    }
    
}
